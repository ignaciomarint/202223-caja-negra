package com.practica.cajanegra;

import com.binarytree.BinaryTree;
import com.binarytree.Node;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PruebaBinaryTree {
    @Test
    public void sumaTest(){
        BinaryTree<String> testtree = new BinaryTree("1");
        Node<String> testnode = new Node("2");
        testtree.insert(testnode.getContent(),testtree.getRoot(),true);
        System.out.println(testtree.getRoot().getLeftChild().getContent().toString());
    }


}
