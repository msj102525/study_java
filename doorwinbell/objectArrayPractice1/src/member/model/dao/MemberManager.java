package member.model.dao;

import java.util.Arrays;
import java.util.Scanner;

import member.model.dto.Member;

public class MemberManager {

	// 1. Field 선언
	private static Member[] memArr = null;
	private static Scanner sc;
	private static final int SIZE = 10;
	private static int memberCount;

	// 2. 초기화블럭 작성 :
	{
		memArr = new Member[SIZE];
		memArr[0] = new Member("kim11*1", "김유신", "awkkk34!", "1@naver.com", 'M', 21);
		memArr[1] = new Member("kim12*2", "이유신", "bwkkk34!", "2@naver.com", 'F', 22);
		memArr[2] = new Member("kim13*3", "박유신", "cwkkk34!", "3@naver.com", 'M', 23);
		memArr[3] = new Member("kim14*4", "최유신", "dwkkk34!", "4@naver.com", 'F', 24);
		memArr[4] = new Member("kim15*5", "문유신", "ewkkk34!", "5@naver.com", 'M', 25);
		memberCount = 5;
		sc = new Scanner(System.in);
	}

	public static int getMemberCount() {
		return memberCount;
	}

	public int getMemberMaxSize() {
		return SIZE;
	}

	public static Member[] getMemberArr() {
		return memArr;
	}

	public static void memberInput() {
		MemberManager mmager = new MemberManager();
		memArr[mmager.getMemberCount()] = new Member();

		System.out.println("회원 정보 입력");
		System.out.print("아이디 입력 : ");
		memArr[memberCount].setId(sc.next());

		System.out.print("이름 입력 : ");
		memArr[memberCount].setName(sc.next());

		System.out.print("패스워드 입력 : ");
		memArr[memberCount].setPassword(sc.next());

		System.out.print("이메일 입력 : ");
		memArr[memberCount].setEmail(sc.next());

		System.out.print("성별 입력(남/여) : ");
		memArr[memberCount].setGender(sc.next().charAt(0));

		System.out.print("나이 입력 : ");
		memArr[memberCount].setAge(sc.nextInt());
		memberCount++;

	};

	public static void deleteMember() {

		System.out.print("회원 삭제할 아이디 입력: ");
		String delId = sc.next();

		int delIdIdx = -1;

		for (int i = 0; i < memberCount; i++) {
			if (memArr[i].getId().equals(delId)) {
				delIdIdx = i;
				System.out.println("=======삭제할 멤버 정보==========");
				System.out.println(memArr[delIdIdx].printMember());

				System.out.print("삭제 함?(y/n) : ");
				char yOrN = sc.next().toLowerCase().charAt(0);
				if (yOrN == 'y') {

					if (delIdIdx != memberCount - 1) {
						for (int j = delIdIdx; j < memberCount - 1; j++) {
							memArr[j] = memArr[j + 1];
						}
					}

					memArr[memberCount - 1] = null;
					memberCount--;
					break;
				} else {
					System.out.println("삭제가 취소되었습니다.");
				}
			}
		}

		if (delIdIdx == -1) {
			System.out.println("해당 아이디의 회원을 찾을 수 없습니다.");
		}
	}

	public static void printAllMember() {
		if (memArr != null) {
			for (int i = 0; i < memberCount; i++) {
				System.out.println("=======회원 정보 ==========");
				System.out.println(memArr[i].printMember());
				System.out.println("현재 멤버 수 : " + memberCount);
			}
		} else {
			System.out.println("=======회원 정보 ==========");
			System.out.println();
			System.out.println("=======회원 없음 ========");
		}
	};

	public static int searchMemberId(String id) {
		for (int i = 0; i < memberCount; i++) {
			if (memArr[i].getId().equals(id)) {
				System.out.println(memArr[i].printMember());
				System.out.println(i);
				return i;
			}
		}
		System.out.println("다시입력");
		return -1;
	}

	public static int searchMemberName(String name) {
		for (int i = 0; i < memberCount; i++) {
			if (memArr[i].getName().equals(name)) {
				System.out.println(memArr[i].printMember());
				System.out.println(i);
				return i;
			}
		}
		System.out.println("다시입력");
		return -1;
	}

	public static int searchMemberEmail(String email) {
		for (int i = 0; i < memberCount; i++) {
			if (memArr[i].getEmail().equals(email)) {
				System.out.println(memArr[i].printMember());
				System.out.println(i);
				return i;
			}
		}
		System.out.println("다시입력");
		return -1;
	}
	
	 public static Member findMember(int index) {
	        if (index >= 0 && index < MemberManager.getMemberCount()) {
	            return MemberManager.getMemberArr()[index];
	        } else {
	            System.out.println("err");
	            return null;
	        }
	    }
	 
	 public static void sortIDAsc() {
		    Member[] sortedArr = Arrays.copyOf(memArr, memberCount);

		    for (int i = 0; i < memberCount - 1; i++) {
		        int minIndex = i;
		        for (int j = i + 1; j < memberCount; j++) {
		            if (sortedArr[j].getId().compareTo(sortedArr[minIndex].getId()) < 0) {
		                minIndex = j;
		            }
		        }
		        Member temp = sortedArr[i];
		        sortedArr[i] = sortedArr[minIndex];
		        sortedArr[minIndex] = temp;
		    }

		    System.out.println("=======아이디순 오름차순 정렬 결과=======");
		    for (Member member : sortedArr) {
		        System.out.println(member.printMember());
		    }
		}
	 public static void sortIDDes() {
		    Member[] sortedArr = Arrays.copyOf(memArr, memberCount);

		    for (int i = 0; i < memberCount - 1; i++) {
		        int maxIndex = i;
		        for (int j = i + 1; j < memberCount; j++) {
		            if (sortedArr[j].getId().compareTo(sortedArr[maxIndex].getId()) > 0) {
		                maxIndex = j;
		            }
		        }
		        Member temp = sortedArr[i];
		        sortedArr[i] = sortedArr[maxIndex];
		        sortedArr[maxIndex] = temp;
		    }

		    System.out.println("=======아이디순 내림차순 정렬 결과=======");
		    for (Member member : sortedArr) {
		        System.out.println(member.printMember());
		    }
		}
	 
	 public static void sortAgeAsc() {
		    Member[] sortedArr = Arrays.copyOf(memArr, memberCount);

		    for (int i = 0; i < memberCount - 1; i++) {
		        int minIndex = i;
		        for (int j = i + 1; j < memberCount; j++) {
		            if (sortedArr[j].getAge() < sortedArr[minIndex].getAge()) {
		                minIndex = j;
		            }
		        }
		        Member temp = sortedArr[i];
		        sortedArr[i] = sortedArr[minIndex];
		        sortedArr[minIndex] = temp;
		    }

		    System.out.println("=======나이순 오름차순 정렬 결과=======");
		    for (Member member : sortedArr) {
		        System.out.println(member.printMember());
		    }
		}
	 public static void sortAgeDes() {
		    Member[] sortedArr = Arrays.copyOf(memArr, memberCount);

		    for (int i = 0; i < memberCount - 1; i++) {
		        int maxIndex = i;
		        for (int j = i + 1; j < memberCount; j++) {
		            if (sortedArr[j].getAge() > sortedArr[maxIndex].getAge()) {
		                maxIndex = j;
		            }
		        }
		        Member temp = sortedArr[i];
		        sortedArr[i] = sortedArr[maxIndex];
		        sortedArr[maxIndex] = temp;
		    }

		    System.out.println("=======나이순 내림차순 정렬 결과=======");
		    for (Member member : sortedArr) {
		        System.out.println(member.printMember());
		    }
		}
	 public static void sortGenderDes() {
		    Member[] sortedArr = Arrays.copyOf(memArr, memberCount);

		    for (int i = 0; i < memberCount - 1; i++) {
		        int maxIndex = i;
		        for (int j = i + 1; j < memberCount; j++) {
		            if (sortedArr[j].getGender() > sortedArr[maxIndex].getGender()) {
		                maxIndex = j;
		            }
		        }
		        Member temp = sortedArr[i];
		        sortedArr[i] = sortedArr[maxIndex];
		        sortedArr[maxIndex] = temp;
		    }

		    System.out.println("=======성별순 내림차순 정렬 결과=======");
		    for (Member member : sortedArr) {
		        System.out.println(member.printMember());
		    }
		}



	


}
