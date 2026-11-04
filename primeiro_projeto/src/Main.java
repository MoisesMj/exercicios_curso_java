void main() {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int y = 2002;

    while (x != y) {
        IO.println("Acesso Negado!");
        x = sc.nextInt();


    }
IO.print("Acesso Permitido!");
    sc.close();
}