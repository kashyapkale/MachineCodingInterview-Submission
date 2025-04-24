package org.MachineCodingInterview.services.impl;

import org.MachineCodingInterview.models.Node;
import org.MachineCodingInterview.services.GameService;

import java.util.Scanner;

public class GameServiceImpl implements GameService {
    public static Scanner scanner = new Scanner(System.in);
    Node headNode;

    @Override
    public void initialize() {
        Node yesNode = new Node(
                "Ronaldo",
                false,
                null,
                null
        );
        headNode =  new Node(
                "Is this person a famous athelete?",
                true,
                yesNode,
                null
                );
        System.out.println("Game initialized successfully !");
    }

    private void handleNoNode(Node currentNode){
        if(currentNode.getNoNode() != null){
            currentNode = currentNode.getNoNode();
        } else {
            System.out.println("I give up! Who is it?");
            String correctAnswer = scanner.nextLine();
            Node correctAnswerNode = new Node(correctAnswer, false, null, null);
            currentNode.setNoNode(correctAnswerNode);
        }
    }

    private void runGame(Node currentNode){
        Boolean gameRestart = false;
        Boolean isGameStarted = true;
        Node thisHeadNode = currentNode;
        while(isGameStarted){

            System.out.println(currentNode.getText());
            String answer = scanner.nextLine();

            if(answer.equals("Y")){
                System.out.println("Is this person " + currentNode.getYesNode().getText());
                answer = scanner.nextLine();
                if(answer.equals("Y")){
                    System.out.println("I guessed it!");
                    isGameStarted = false;
                } else{
                    //handleNoNode(currentNode);
                    if(currentNode.getNoNode() != null){
                        currentNode = currentNode.getNoNode();
                    } else {
                        System.out.println("I give up! Who is it?");
                        String correctAnswer = scanner.nextLine();
                        Node correctAnswerNode = new Node(correctAnswer, false, null, null);
                        currentNode.setNoNode(correctAnswerNode);
                        runGame(thisHeadNode);
                    }
                }
            } else {
                if(currentNode.getNoNode() != null){
                    currentNode = currentNode.getNoNode();
                } else {
                    System.out.println("I give up! Who is it?");
                    String correctAnswer = scanner.nextLine();
                    Node correctAnswerNode = new Node(correctAnswer, false, null, null);
                    currentNode.setNoNode(correctAnswerNode);
                    runGame(thisHeadNode);
                }
            }
        }
    }
    @Override
    public void startNewGame() {
        System.out.println("New Game!");
        Boolean isGameStarted = true;
        Node currentNode = headNode;
        Boolean gameRestart = false;
        runGame(currentNode);
    }

    @Override
    public void isQuestionNode() {

    }
}
