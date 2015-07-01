package com.cloudwick.hive.HiveUDF;

import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;

@Description(name ="concat",
			value ="_FUNC(id,name)",
			extended = "select _FUNC_(id,name) froms src"
		)
public class Concat extends UDF{
	public String evaluate(int id, String name){
		String concat = id + name;
		return concat;
	}
}
