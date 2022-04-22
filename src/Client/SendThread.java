package Client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SendThread extends Thread {
	private final Socket socket;

//	콘솔입력받기
	Scanner scanner = new Scanner(System.in);

	public SendThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
//			네트웍 전송을 위한 패킷 설정 부분 : 준비 단계
			DataOutputStream sendWriter = new DataOutputStream(socket.getOutputStream());

			String sendString;
			while (true) {
//				콘솔 입력 처리
				sendString = scanner.nextLine();
//				콘솔 입력 받은 부분 전송
				sendWriter.writeUTF(sendString);
//				버퍼에 있는 메세지를 즉시 비워서 출력(대기X)
				sendWriter.flush();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
