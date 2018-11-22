// ÿ�θ���Ʈ, �ǾƴϽ�Ʈ, ���̿ø��Ͻ�Ʈ Ŭ���� �����
// ������ Ŭ������ �����ϴ� �޼ҵ带 ����: "**�� �����մϴ�."�� ���
// ���(������ Ŭ������ ���)�� ����Ͽ� ����

// �����ڵ鿡�� ������ �� �ִ� ������ Ŭ���� ���� �����ϱ�!
// �����ڸ� �Ű������� �޾� �����ϴ� �޼ҵ�

class Musician{
	void play(){
		System.out.println("�����մϴ�.");
	}
}

class Cellist extends Musician{
	@Override
	void play(){
		System.out.print("ÿ�θ� ");
		super.play();
	}
}

class Pianist extends Musician{
	@Override
	void play(){
		System.out.print("�ǾƳ븦 ");
		super.play();
	}
}

class Violinist extends Musician{
	@Override
	void play(){
		System.out.print("���̿ø��� ");
		super.play();
	}
}

class Constructor{
	public static void main(String[] args){
		/*
		Cellist c1 = new Cellist();
		Cellist c2 = new Cellist();
		Pianist p1 = new Pianist();
		
		c1.play();
		c2.play();
		p1.play();
		*/
		
		Cellist c1 = new Cellist();
		Musician c2 = new Cellist();
		// �� ��ü�� ���� �̸����� �Ҹ� �� ���� -> ������
		
		/*
		Cellist[] c = {new Cellist(), new Cellist(), new Cellist()};
		Pianist[] p = {new Pianist(), new Pianist(), new Pianist()};
		Violinist[] v = {new Violinist(), new Violinist(), new Violinist()};
		
		for(Cellist cellist: c){
			cellist.play();
		}
		
		for(Pianist pianist: p){
			pianist.play();
		}
		
		for(Violinist violinist: v){
			violinist.play();
		}
		*/
		
		Musician[] musicians = {new Cellist(), new Cellist(), new Cellist(), new Pianist(), new Pianist(), new Pianist(), new Violinist(), new Violinist()};
		
		for(int i=0;i<musicians.length;i++){
			musicians[i].play();
		}
	}
}