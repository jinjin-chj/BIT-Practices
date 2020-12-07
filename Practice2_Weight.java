
public class Practice2_Weight {
	/*
	 * 사용자로부터 키를 입력받아서(system.in) 표준 체중을 계산한 후에 사용자의 체중과 비교하여 "저체중인지, 표준인지, 과체중인지"를
	 * 판단하는 프로그램을 작성하라. 표준 체중 계산식은 다음을 사용하라. [ 표준체중 = ( 키 - 100 ) * 0.9 ]
	 * 
	 */
	private double myHeight;
	private double myWeight;
	private double sWeight;

	public Practice2_Weight(double myHeight, double myWeight) {
		this.myHeight = myHeight;
		this.myWeight = myWeight;
		sWeight = ((myHeight - 100) * 0.9);
		// 위에서 정의해버리면 순서가 섞여서 안됨. 키랑 몸무게가 다 0이 들어가버리니까.
	}

	public void Standard() {
		if (myWeight > sWeight) {
			System.out.println("당신은 과체중입니다.");
		} else if (myWeight == sWeight) {
			System.out.println("당신은 표준 체중입니다.");
		} else if (myWeight < sWeight) {
			System.out.println("당신은 저체중입니다.");
		}
	}

}
