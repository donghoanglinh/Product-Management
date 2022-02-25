package AS02;

import java.util.Scanner;

/**
 * read data from file, save in linked list, console
 * input new product and add new product in linked list at the end
 * console linked list
 * write linked list to file
 * search product follow ID
 * remove product follow ID
 * sort linked list by ID
 * console quantity product to binary by rur
 * read file and save in stack, console
 * read file and save in queue, console
 */
public class AS02_Main {
    public static Scanner SC = new Scanner(System.in);

    // print main menu of program
    public static int mainMenu(){
        System.out.println("|----------------MENU-----------------|");
        System.out.println("| 1. Input data from file             |");
        System.out.println("| 2. Add product information          |");
        System.out.println("| 3. Print data information           |");
        System.out.println("| 4. Save data to file                |");
        System.out.println("| 5. Search product information by ID |");
        System.out.println("| 6. Remove product information by ID |");
        System.out.println("| 7. Sort data                        |");
        System.out.println("| 8. Print binary                     |");
        System.out.println("| 9. Print data follow stack          |");
        System.out.println("| 10.Print data follow queue          |");
        System.out.println("|-------------------------------------|");
        System.out.println();

        // choice option and loop when choice wrong number
        int choice;
        do {
            System.out.println("Please choice option do you want: ");
            choice = SC.nextInt();
        } while (choice < 0 || choice > 10);
        return choice;
    }

    //main method of program
    public static void main(String[] args) {
        // check loop program
        String answer;

        // create new Linked list to contain data
        LinkedList list = new LinkedList();

        do {
            // print and choice option
            int choice = mainMenu();

            // 10 function of program

            // read data from file and assign to linked list
            if (choice == 1) {
                OperationToProduct.getDataFromFile(list);
                System.out.println("Data of product information:");
                System.out.println(list);
            }

            // add new product information into list
            else if (choice == 2) {
                OperationToProduct.inputItem(list);
            }

            // print product information
            else if (choice == 3) {
                OperationToProduct.printList(list);
            }

            // write data list to file txt
            else if (choice == 4) {
                OperationToProduct.outputData("data.txt",list);
            }

            // search product information by ID
            else if (choice == 5) {
                OperationToProduct.search(list);
            }

            // remove product information
            else if (choice == 6) {
                OperationToProduct.removeProduct(list);
            }

            // sort data list increasing
            else if (choice == 7) {
                OperationToProduct.sortData(list);
            }

            // convert quantity of first product to binary
            else if (choice == 8) {
                OperationToProduct.convertToBinaryFromList(list);
            }

            // read file to stack and print
            else if (choice == 9) {
                Stack stack = OperationToProduct.getDataFromFileToStack();
                System.out.println(stack);
            }

            // read file to queue and print
            else if (choice == 10) {
                Queue queue = OperationToProduct.getDataFromFileToQueue();
                System.out.println(queue);
            }

            //ask to run program again
            do {
                System.out.print("Do you want to run again (y/n): ");
                answer = SC.next();
            } while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n"));
        } while (answer.equalsIgnoreCase("y"));

    }
}
