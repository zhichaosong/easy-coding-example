package main;

import java.util.Scanner;

import example.*;

public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("请输入页数，系统将运行该页源码：");
			int page = scanner.nextInt();
			runExample(page);
		}
	}
	
	public static void runExample(int page) {
		try {
			switch (page) {
				case 3:
					new C1P3_Binary();
					break;
				case 5:
					new C1P5_Logic();
					break;
				case 56:
					new C2P56_OuterClass();
					break;
				case 66:
					new C2P66_ParamPassing();
					break;
				case 69:
					new C2P69_ObjectArgs();
					break;
				case 72:
					new C2P72_Son();
					break;
				case 73:
					new C2P73_StaticCode();
					break;
				case 79:
					new C2P79_Son();
					break;
				case 80:
					new C2P80_Father();
					break;
				case 82:
					new C2P82_OverloadMethods();
					break;
				case 84:
					new C2P84_Stove();
					break;
				case 85:
					new C2P85_GenericDefinitionDemo();
					break;
				case 86:
					new C2P86_Stove();
					break;
				case 92:
					new C2P92_LongIntegerCacheTest();
					break;
				case 100:
					new C3P100_CourseTypeEnum();
					break;
				case 104:
					new C3P104_SpaceCodeStyle();
					break;
				case 117:
					new C4P117_ClassTest();
					break;
				case 122:
					new C4P122_CustomClassLoader();
					break;
				case 140:
					new C5P140_TryCatchFinally();
					break;
				case 159:
					new C6P159_ArraysAsList();
					break;
				case 161:
					new C6P161_ListToArry();
					break;
				case 163:
					new C6P163_ToArraySpeedTest();
					break;
				case 164:
					new C6P164_ListNoGeneric();
					break;
				case 167:
					new C6P167_AnimalCatGarfield();
					break;
		
				default:
					System.out.println("没有这段代码");
					break;
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
