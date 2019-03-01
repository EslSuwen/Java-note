package examples;

public class Queen8 {
	static final int MAX_NUM = 8;
	int chessBoard[][] = new int[MAX_NUM][MAX_NUM];
	//���̵ķ�Χ���Լ��ʺ�������������ö�ά���鶨��
	//�������Ƿ�Ϲ�
	boolean check(int x, int y) {
		for (int i = 0; i < y; i++) {
			//�������
			if (chessBoard[x][i] == 1) {
				return false;
			}
			//������б��
			if (x - 1 - i >= 0 && chessBoard[x - 1 - i][y - 1 - i] == 1) {
				return false;
			}
			//�������б��
			if (x + 1 + i < MAX_NUM && chessBoard[x + 1 + i][y - 1 - i] == 1) {
				return false;
			}
		}
		return true;
	}

	boolean settleQueen(int y) {
		//�����������ˣ�����ʾ�ҵ���
		if (y == MAX_NUM) {
			return true;
		}
		//������ǰ�У���һ������֤
		for (int i = 0; i < MAX_NUM; i++) {
			//Ϊ��ǰ�����㣬������ݳ���������
			for (int x = 0; x < MAX_NUM; x++) {
				chessBoard[x][y] = 0;
			}
			//����Ƿ���Ϲ���������ϣ�����Ԫ�ؽ�һ���ݹ�
			if (check(i, y)) {
				chessBoard[i][y] = 1;
				//�������true��˵���²����ҵ��ⷨ���������ѭ��
				if (settleQueen(y + 1)) {
					return true;
				}
			}
		}
		return false;
	}

	void printCHessBoard() {
		for (int i = 0; i < MAX_NUM; i++) {
			for (int j = 0; j < MAX_NUM; j++) {
				System.out.print(chessBoard[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Queen8 queen8 = new Queen8();
		queen8.settleQueen(0);
		queen8.printCHessBoard();
	}
}
