package example;

public class C3P100_CourseTypeEnum {
	public C3P100_CourseTypeEnum() {
		System.out.print("\nChapter 3, page 100: test CourseTypeEnum\n##################\n");
		goTest();
	}

	public void goTest() {
		System.out.println(CourseTypeEnum.VIDEO_COURSE.getSeq());
		System.out.println(CourseTypeEnum.VIDEO_COURSE.getDesc());
		System.out.println(CourseTypeEnum.LIVE_COURSE.getSeq());
		System.out.println(CourseTypeEnum.LIVE_COURSE.getDesc());
		System.out.println(CourseTypeEnum.OFFLINE_COURSE.getSeq());
		System.out.println(CourseTypeEnum.OFFLINE_COURSE.getDesc());
		getPackageCourse(3L, 1L);
	}

	public void getPackageCourse(Long packageId, Long userId) {
		if (packageId == CourseTypeEnum.OFFLINE_COURSE.getSeq()) {
			System.out.println("线下课程，无法在线观看");
			return;
		}

		// VideoCourse course = packageService.getByTeacherId(userId);
		// if (course.getState == BaseCourseState.UNAUTHED_COURSE) {
		// 	System.out.println("未审核课程");
		// 	return;
		// }
	}

	enum CourseTypeEnum {
		VIDEO_COURSE(1, "录播课程"),
		LIVE_COURSE(2, "直播课程"),
		OFFLINE_COURSE(3, "线下课程");
		private int seq;
		private String desc;
		
		CourseTypeEnum(int seq, String desc) {
			this.seq = seq;
			this.desc = desc;
		}
		
		public int getSeq() {
			return seq;
		}
		
		public String getDesc() {
			return desc;
		}
	}

	public abstract class BaseCourseState {
		public static final int NEW_COURSE = 1;
		public static final int UNAUTHED_COURSE = 2;
		public static final int PASSED_COURSE = 3;
		public static final int NOT_PASSED_COURSE = 4;
		public static final int DELETED_COURSE = 5;

	}
}
