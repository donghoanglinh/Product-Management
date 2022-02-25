package AS02;

import java.io.*;
import java.util.Scanner;

/**
 * create all method for function of program
 */
public class OperationToProduct {

    // get data from File and return list
    public static LinkedList getDataFromFile(LinkedList list){
        FileReader fr = null;
        try {
            fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null){
                String[] productInfor = line.split(" - ");
                Product newProduct = new Product(productInfor[0],productInfor[1],Double.parseDouble(productInfor[2]),Integer.parseInt(productInfor[3]));
                list.insertAtTail(newProduct);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    // add information of product to list
    public static LinkedList inputItem(LinkedList list){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name of product: ");
        String name = sc.nextLine();
        System.out.print("Input price of product: ");
        double price = sc.nextDouble();
        System.out.print("Input quantity of product: ");
        int quantity = sc.nextInt();
        String id = name.substring(0,3).toUpperCase() + name.length();
        System.out.println("Automatic create ID of product: " + id);
        Product newProduct = new Product(id, name, price, quantity);
        list.insertAtTail(newProduct);
        return list;
    }

    //write data to file txt
    public static void outputData(String filename, LinkedList list){
        try {
            FileWriter fw = new FileWriter(filename, false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(list.toString());
            bw.flush();
            bw.close();
            System.out.println("Complete!!!!!!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //print data list
    public static void printList(LinkedList list){
        System.out.println("List of product information in Data");
        if (list.isEmpty()) {
            System.out.println("Data is empty");
        } else {
            System.out.println(list.toString());
        }
    }

    //search product information by id
    public static void search(LinkedList list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input id do you want to search: ");
        String id = sc.next();
        list.search(id);
    }

    // remove product information from list
    public static void removeProduct(LinkedList list){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input id do you want to remove: ");
        String id = sc.next();
        list.removeNode(id);
        System.out.print("Complelte !!!!!!");
    }

    // Sort data list
    public static void sortData(LinkedList list) {
        list.sortList();
        System.out.println("Complete !!!!!!");
        System.out.println(list);
    }
    // covert to Binary of product quantity of Data
    public static void convertToBinaryFromList(LinkedList list){
        System.out.println("Product: " + list.head.getInfor().getId());
        System.out.println("Quantity in decimal coefficient: " + list.head.getInfor().getQuantity());
        System.out.println("Convert to binary coefficient: ");
        convertToBinary(list.head.getInfor().getQuantity());
    }

    // convert to Binary by recursion
    public static void convertToBinary(int i){
        if (i == 0){
            return;
        } else {
            convertToBinary(i/2);
            System.out.print(i%2);
        }
    }

    // get data from file and input to stack
    public static Stack getDataFromFileToStack(){
        Stack stack = new Stack();
        FileReader fr = null;
        try {
            fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null){
                String[] productInfor = line.split(" - ");
                Product newProduct = new Product(productInfor[0],productInfor[1],Double.parseDouble(productInfor[2]),Integer.parseInt(productInfor[3]));
                stack.push(newProduct);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stack;
    }

    // get data from file and input to queue
    public static Queue getDataFromFileToQueue(){
        Queue queue = new Queue();
        FileReader fr = null;
        try {
            fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null){
                String[] productInfor = line.split(" - ");
                Product newProduct = new Product(productInfor[0],productInfor[1],Double.parseDouble(productInfor[2]),Integer.parseInt(productInfor[3]));
                queue.push(newProduct);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return queue;
    }


}
