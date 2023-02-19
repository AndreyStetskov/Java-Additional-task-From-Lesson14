import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("WriteOnlyObject")
public class Main {
    public static void main(String[] args) {

        Node pointOne = new Node(null, 1);
        Node pointTwo = new Node(null, 2);
        Node pointThree = new Node(null, 3);
        Node pointFour = new Node(null, 4);
        Node pointFive = new Node(null, 5);
        Node pointSix = new Node(null, 6);
        Node additional = new Node(null, 7);

        List<Node> fromOne = new ArrayList<>();
        fromOne.add(pointTwo);
        fromOne.add(pointThree);
        pointOne.setRib(fromOne);

        List<Node> fromThree = new ArrayList<>();
        fromThree.add(pointFour);
        fromThree.add(pointFive);
        pointThree.setRib(fromThree);

        List<Node> fromFive = new ArrayList<>();
        fromFive.add(pointSix);
        pointFive.setRib(fromFive);

        List<Node> fromSix = new ArrayList<>();
        fromSix.add(pointThree);
        pointSix.setRib(fromSix);

        List<Node> fromAdditional = new ArrayList<>();
        fromAdditional.add(pointOne);
        fromAdditional.add(pointTwo);
        fromAdditional.add(pointThree);
        fromAdditional.add(pointFour);
        fromAdditional.add(pointFive);
        fromAdditional.add(pointSix);
        additional.setRib(fromAdditional);
    }
}