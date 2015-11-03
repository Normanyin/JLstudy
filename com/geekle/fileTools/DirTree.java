package com.geekle.fileTools;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirTree {

	public static void main(String[] args) {
		File rootFile = new File("D:\\testDir");
		
		List<Map> listMap = new ArrayList<Map>();
		
		getDir(rootFile,listMap);
		
		System.out.println(listMap);
	}

	private static void getDir(File file, List<Map> listMap) {
		Map map = new HashMap();
		map.put("name", file.getName());
		map.put("path", file.getPath());
		List<Map> l = new ArrayList<Map>();
		map.put("child", l);
		File[] files = file.listFiles();
		if (file.listFiles(new FileFilterTool()).length > 0) {
			map.put("fileNum", file.listFiles(new FileFilterTool()).length);
		}
		listMap.add(map);
		for (int i = 0;files!=null && i <  files.length ; i++ ) {
			if (files[i].isDirectory()) {
				getDir(files[i], l);
			}
		}

	}
}
