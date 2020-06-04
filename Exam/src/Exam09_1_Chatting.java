

public class Exam09_1_Chatting {
	void startChat(final String chatId) {
		String nickName = null;
		nickName = chatId;

		class Chat {
			public void start() {
				while (true) {
					String inputData = "æ»≥Á«œººø‰";
					String message = "[" + chatId + "] " + inputData;
					sendMessage(message);
				}
			}

			void sendMessage(String message) {

			}
		}

		Chat chat = new Chat();
		chat.start();
	}
}