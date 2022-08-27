package seleniumProject;

public class NumberToWord {

	public static void main(String[] args) {
		int n=1550;
		if(n<0||n>9999)
		{
			System.out.println("Wrong data");
		} else
		{
		int u=n%10;   //0
		int tt=n/10;   // 155
		int t=tt%10;   // 5
		int hh=n/100;  //15
		int h=hh%10;  //5
		int th=n/1000; //1
		int tht=th%1000;//550
		String[] uw ={" ","one","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
				"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Egihteen","Ninteen"};
		String[] tw={" "," ","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};
		String hw= " Hundred";
		String thw=" Thousand";
			if(n<20)
			{
				System.out.println(uw[u]);
			} else if(n<100)
			{
				System.out.println(tw[t]+" "+uw[u]);
			}else if(n<1000)
			{
				System.out.println(uw[h]+hw+" "+tw[t]+" "+uw[u]);
			} else 
			{
				System.out.println(uw[tht]+thw+" "+uw[h]+hw+" "+tw[t]+" "+uw[u]);
			}
				
		}

	}

	}


