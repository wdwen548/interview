package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @Class Solution
 * @Date 2020/5/19
 * @User yuewen
 * @Description
 */

public class Solution {

    public static void main(String[] args) {
        Pair pair1 = new Pair('A', 'B');
        Pair pair2 = new Pair('B', 'C');
        Pair pair3 = new Pair('A', 'D');
        Pair pair4 = new Pair('A', 'E');
        Pair pair5 = new Pair('E', 'F');
        Pair pair6 = new Pair('D', 'G');
        Pair pair7 = new Pair('A', 'H');

        ArrayList<Pair> pairs = new ArrayList<>();
        pairs.add(pair1);
        pairs.add(pair2);
        pairs.add(pair3);
        pairs.add(pair4);
        pairs.add(pair5);
        pairs.add(pair6);
        pairs.add(pair7);

        Node head = new Solution().treeTrans(pairs);
    }

    public Node treeTrans(List<Pair> list) {
        Node head = null;
        if (list == null || list.size() <= 0) {
            return null;
        }
        int n = list.size();
        HashMap<Character, Node> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            Pair pair = list.get(i);
            Character left = pair.getLeft();
            Character right = pair.getRight();


            Node pNode = map.get(left);
            if (pNode == null) {
                pNode = new Node(new Node[n], left);
                map.put(left, pNode);
            }
            Node sNode = map.get(right);
            if (sNode == null) {
                sNode = new Node(new Node[n], right);
                map.put(right, sNode);
            }
            if(head == null){
                head = pNode;
            }else{
                if(head.value == right){
                    head = pNode;
                }
            }
            for (int j = 0; j < n; j++) {
                if(pNode.nodes[j] == null){
                    pNode.nodes[j] = sNode;
                    break;
                }
            }
        }

        return head;
    }
}
