
public class Principal {
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario("Gabriella Maria de Oliveira", 16, "Bibi", "Amora");

    System.out.println("O nome é: " + usuario.getNome());
    System.out.println("A idade é: " + usuario.getIdade());
    System.out.println("O username é: " + usuario.getUsername());
    usuario.setSenha("Dandara123");

    if(usuario.verificaSenha("Dandara")){
        System.out.println("senha válida");
    }else{
        System.out.println("senha inválida");
    }
    }
}

    
