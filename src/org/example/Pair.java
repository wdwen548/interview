package org.example;

/**
 * @Class Pair
 * @Date 2020/5/19
 * @User yuewen
 * @Description
 */

public class Pair {

    Character left;
    Character right;

    public Pair(Character left, Character right) {
        this.left = left;
        this.right = right;
    }

    public Character getLeft() {
        return left;
    }

    public void setLeft(Character left) {
        this.left = left;
    }

    public Character getRight() {
        return right;
    }

    public void setRight(Character right) {
        this.right = right;
    }
}
