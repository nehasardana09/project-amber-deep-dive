import java.util.*;

record Caller(String phoneNumber) { }

static List everyFifthCaller(Queue<Caller> q, int prizes) {
    var winners = new ArrayList<Caller>();
    try {
        while (prizes > 0) {
            Caller _ = q.remove();
            Caller _ = q.remove();
            Caller _ = q.remove();
            Caller _ = q.remove();
            winners.add(q.remove());
            prizes--;
        }
    } catch (NoSuchElementException _) {
        System.out.println("no elements found");
    }
    return winners;
}

public void main() {
    Queue<Caller> q = new LinkedList<>();
    q.add(new Caller("123334"));
    q.add(new Caller("3434343"));
    q.add(new Caller("43434355"));
    q.add(new Caller("43436812"));
    q.add(new Caller("2435787"));
    q.add(new Caller("545444"));
    q.add(new Caller("43436812"));
    q.add(new Caller("2435787"));
    q.add(new Caller("545444"));
    q.add(new Caller("43436812"));
    q.add(new Caller("24357871212121212"));
    q.add(new Caller("545444"));
    q.add(new Caller("43436812"));
    q.add(new Caller("2435787"));
    q.add(new Caller("545444"));

    List winner = everyFifthCaller(q, 10);
    System.out.println(winner);
}