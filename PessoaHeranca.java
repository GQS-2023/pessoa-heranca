package com.mycompany.pessoaheranca;

/**
 *
 * @author rafaelamoreira
 */
public class PessoaHeranca {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Maria", "920.287.886-23");
        Aluno a1 = new Aluno("José", "565.241.896-63", "3435334");
        Professor pf1 = new Professor("Rafaela","926.265.106-61");
        p1.email = "maria@gmail.com";
        pf1.email = "rafapcmor@gmail.com";
        pf1.setSalario(10000.00);
        pf1.setTitulo("Doutora em MMC");
        a1.email = "jose.tech@gmail.com";
        System.out.println("---- Pessoa ---- \n" + p1.toString());
        System.out.println("---- Aluno ---- \n" + a1.toString());
        System.out.println("---- Professor ---- \n" + pf1.toString());
    }
}
