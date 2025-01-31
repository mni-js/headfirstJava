public class PhraseOMatic {
    public static void main(String[] args) {

        String[] wordListOne = {"agnostic", "opinionated", "voice activated", "haptically driven", "extensible",
                                "reactive", "agent based", "functional", "AI enabled", "strongly typed"};

        String[] wordListTwo = {"loosely coupled", "six sigma", "asynchronous", "event driven", "pub-sub", "IoT",
                                "clout native", "service oriented", "containerized", "serverless", "microservices",
                                 "distributed ledger"};
        
        String[] wordListThree = {"framework", "library", "DSL", "REST API", "repository", "pipeline", "service mesh",
                                "architecture", "perspective", "design", "orientation"};

        // 각 단어 목록의 길이 확인
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // 난수 발생
        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        // 구문 만들기
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        // 구문 출력
        System.out.println("What we need is a " + phrase);
    }
}