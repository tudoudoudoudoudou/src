package com.gingkoo.rpt.dbsvr.server;

import org.apache.log4j.PropertyConfigurator;

import com.gingkoo.gal.orm.mybatis.dbsvr.GeneratorMain;

public class MybatisGenerator {

	public static void main(String[] args) throws Exception {
		PropertyConfigurator.configure("war/WEB-INF/log4j.properties");
		GeneratorMain.main(args);
	}
}
