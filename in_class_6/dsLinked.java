class PanMae
{	private String pmyung; 		// 클래스 필드
   	private int    sryang;
   	private int    danga;
   	public  PanMae daum;      	// 다음 노드(PanMae 개체)를 가리킨다
	public PanMae(String pm, int sr, int dg)
      {	pmyung = pm;
      	sryang = sr;
      	danga  = dg;    }
	public void pyoSi()
      {	System.out.println(pmyung + '\t' + sryang + '\t' + danga);  }
}
class dsLinked
{	public static void main(String[] args)
      {  	PanMae pm1 =  new PanMae("1 SaGwa", 5, 1000);
      	PanMae pm2 =  new PanMae("2 Bae",   3, 2000);
      	PanMae pm3 =  new PanMae("3 PoDo",  7,  500);
	      	pm1.daum = pm3; 		// pm1-pm3-pm2 순으로 연결
		pm3.daum = pm2;
      	pm2.daum = null;       	// 마지막 개체의 daum을 null로 막는다
		PanMae p = pm1; 	// p로 하여금 연결 리스트의 처음 노드를 가리키게 한다
		// p로 하여금 연결 리스트의 처음 노드를 가리키게 한다
		// 연결 리스트의 각 노드를 표시
		      while (p != null)
		      {	p.pyoSi();
		         	p = p.daum;         // p를 다음번 노드로 이동
		      }
			PanMae pm4 =  new PanMae("4 Gam",  9,  200);
		// pm3-pm2 사이에 pm4를 삽입
		      pm3.daum = pm4;
		      pm4.daum = pm2;
			System.out.println("\n<Node SaIbHoo>\n");
		      p = pm1;
		// 연결 리스트의 각 노드를 표시
		      while (p != null)
		      {	p.pyoSi();
		         	p = p.daum;         // p를 다음번 노드로 이동
		      }
		  }
		}
