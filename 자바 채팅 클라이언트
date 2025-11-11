package chatting;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//Client 파트 구현 목록
//(1) 서버에 접속(Socket 생성) // 접속 버튼이 클릭되었을때
//(2) 서버로 메세지 송신
//(3) 서버에서 보내는 메세지 수신

//클라이언트 화면에서 처리되어야 하는 이벤트 목록
//"접속" 버튼 클릭시 서버에 접속
//대화창에 "enter" 입력시 서버로 메세지 전송






//채팅 메세지 입력창, 대화창에 기본적으로 제공되는 클라이언트 화면 구현
class ClientUI extends JFrame{
	JButton con; // 서버 접속을 위한 버튼
	JTextField jtf; // 채팅 메세지 입력창
	JTextArea jta; // 대화창

	Socket client; // 서버의 통신을 위한 종이컵
	OutputStream os; //서버에 데이터를 전송하기 위한 실
	InputStream is; // 서버에 데이터를 수신하기 위한 실
	
	
	//서버에 접속을 성공하고 나면 Thread를 구동시켜워쟈 함
	class ClientThread extends Thread{
		public void run() {
		//3)서버에서 보내는 메세지 수신
			while( true ) {
				try {
					//종이컵에서 읽기위한 실 뽑아내기
					byte[] b = new byte[1024];
					is.read(b); //1024바이트 읽어서 배열 b에 저장
					//수신된 메세지 화면에 보여주기
					String str = new String(b); //바이트값 -> 문자열 변환
					jta.append(str.trim() + '\n'); // 빈공백 제거 후 화면에 보여주기
				} catch (IOException e) {
					e.printStackTrace();
			}
				
		}
			
	}
	
}
			
	class MyListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			//callback method
			//버튼이 클릭되거나 "enter"키가 입력되면 호출되는
			//콜백 메소드
			//버튼이 눌렸는지 엔터키가 눌렸는지 구분 해주기
			String str = e.getActionCommand();
			if (str.equals("서버접속")) {
				try {
					//서버에 접속 (Socket 생성)
					//client = new Socket("127.0.0.1",8888);
					client = new Socket("210.101.236.171",8888);
					//서버 접속을 성공하고 나면
					is = client.getInputStream();
					os = client.getOutputStream();
					
					new ClientThread().start();	
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				System.out.println("서버 접속 버튼 클릭됨");
				
			}else {		//입력창에 "enter" key 입력 되었을때
				//2)서버로 메세지 송신
		
				String msg = jtf.getText();
				try {
					os.write(msg.getBytes());
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}

				
			}

		}
		
	}
	
	public ClientUI() {
		super("이것은클라이언트");
		jtf = new JTextField(20);
		jta = new JTextArea(30,30);
		con = new JButton("서버접속");
		
		FlowLayout layout = new FlowLayout(); //화면 배치 관리자
		setLayout(layout); //현재 판때기에 배치 관리자 설정
		add(jtf); //판때기에 한줄 입력창 먼저 배치
		add(con); // 그다음 접속 버튼
		add(jta); // 마지막으로 대화창 배치
				
		
		MyListener m = new MyListener();
		//접속 버튼에 감시자 달아주기
		con.addActionListener(m);
		
		//입력창에 event handling
		//한줄 입력창에 감시자 달아주기
		jtf.addActionListener(m);

		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,500); //판때기 사이즈 조절
		setLocation(250,250); // 판때기 보여질 위치 조절
		setVisible(true); //판때기 화면에 보여주기		
		
	}
}

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		new ClientUI();
		
		

		
		
		
		
	}

}
