package example;

public class C3P104_SpaceCodeStyle {
	// 没有必要增加若干空格使变量的赋值等号与上一行对应位置的等号对齐
	private static Integer one = 1;
	private static Long two = 2L;
	private static Float three = 3F;
	private static StringBuilder sb = new StringBuilder("code style:");

	// 缩进 4 个空格（注意：本代码中的任何注释在双斜线与注释内容之间有且仅有一个空格）
	public C3P104_SpaceCodeStyle() {
		System.out.print("\nChapter 3, page 104: test SpaceCodeStyle\n##################\n");
		// 继续缩进 4 个空格
		try {
			// 任何二目运算符的左右必须有一个空格
			int count = 0;
			// 三目运算符的左右两边都必须有一个空格
			boolean condition = (count == 0) ? true : false;

			// 关键词if与左侧小括号之间必须有一个空格
			// 左括号内的字母 c 与左括号、字母 n 与右括号都不需要空格
			// 右括号与左大括号前加空格且不换行、左大括号后必须换行
			if(condition) {
				System.out.println("world");
				// else 的前后都必须加空格
				// 右大括号与左大括号前加空格且不换行，左大括号后必须换行
			} else {
				System.out.println("ok");
				// 右大括号后直接结束，则必须换行
			}
		// 如果大括号内为空，则简洁地写成 {} 即可，大括号中间无需换行和空格
		} catch (Exception e) {}

		// 在每个实参逗号之后都必须有一个空格
		String result = getString(one, two, three, sb);
		System.out.println(result);
	}

	public static String getString(Integer one, Long two, Float three,
		StringBuilder sb) {
		// 任何二目运算符的左右必须有一个空格，包括赋值运算符、加号运算符等
		Float temp = one + two + three;
		sb.append(temp);
		return sb.toString();
	}
}
