
package rpgdetexto;

/**
 *
 * @author Ryan
 */
import java.util.Scanner;
import java.util.Random;

public class RPGdeTexto {
    
    static int hp = 100, ataque = 10, ouro = 0, nivel = 1, xp = 0, xpParaSubir = 20;
    static String inventario = "Espada de Madeira";
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        
        System.out.println("==========================================");
        System.out.println("           Bem-vindo ao RPG!");
        System.out.println("==========================================");
        
        while (true) {
            
            mostrarStatus();
            
            System.out.print("Digite sua escolha (1/2/3/4): ");
            
            String escolha = scanner.nextLine();
            
            switch (escolha) {
                
                case "1": explorar(); break;
                
                case "2": descansar(); break;
                
                case "3": loja(); break;
                
                case "4": sair(); return;
                
                default: System.out.println("Opção inválida."); pausa(); break;
                
            }
            
        }
        
    }

    static void mostrarStatus() {
        
        System.out.println("Seu status:");
        
        System.out.printf("  Nível: %d\n  XP: %d / %d\n  HP: %d\n  Ataque: %d\n  Ouro: %d\n  Inventário: %s\n",nivel, xp, xpParaSubir, hp, ataque, ouro, inventario);
        
        System.out.println("==========================================");
        System.out.println("Escolha sua ação:");
        System.out.println("  1. Explorar\n  2. Descansar\n  3. Loja\n  4. Sair");
        System.out.println("==========================================");
        
    }

    static void explorar() {
        
        System.out.println("Você decidiu explorar as terras perigosas...");
        int evento = random.nextInt(3) + 1;
        
        switch (evento) {
            
            case 1: batalha(); break;
            case 2: tesouro(); break;
            case 3: armadilha(); break;
            
        }
        
    }

    static void batalha() {
        
        int inimigoHp = 30 + random.nextInt(20);
        int inimigoAtaque = 5 + random.nextInt(5);
        
        System.out.println("Você encontrou um monstro!");
        
        System.out.printf("Inimigo - HP: %d | Ataque: %d\n", inimigoHp, inimigoAtaque);

        while (true) {
            
            System.out.printf("Seu HP: %d | HP do inimigo: %d\n", hp, inimigoHp);
            System.out.print("Escolha sua ação (1. Atacar / 2. Fugir): ");
            String escolha = scanner.nextLine();
            
            if (escolha.equals("1")) {
                
                inimigoHp -= ataque;
                
                if (inimigoHp <= 0) {
                    
                    vitoriaBatalha();
                    break;
                    
                }
                
                hp -= inimigoAtaque;
                if (hp <= 0) {
                    
                    gameOver();
                    break;
                    
                }
                
            } else if (escolha.equals("2")) {
                
                System.out.println("Você fugiu da batalha!");
                pausa();
                break;
                
            } else {
                
                System.out.println("Opção inválida.");
                
            }
        }
    }

    static void vitoriaBatalha() {
        
        ouro += random.nextInt(20);
        xp += 10;
        System.out.printf("Você derrotou o inimigo e ganhou %d de ouro e 10 XP.\n",ouro);
        
        if (xp >= xpParaSubir) {
            
            nivel++;
            xp -= xpParaSubir;
            xpParaSubir += 20;
            ataque += 5;
            System.out.printf("Parabéns! Você subiu para o nível %d. Ataque agora é %d.\n", nivel, ataque);
            
        }
        
        pausa();
        
    }

    static void tesouro() {
        
        int ganho = 10 + random.nextInt(20);
        ouro += ganho;
        System.out.printf("Você encontrou um tesouro e ganhou %d de ouro.\n", ganho);
        pausa();
        
    }

    static void armadilha() {
        
        int dano = 10 + random.nextInt(10);
        hp -= dano;
        System.out.printf("Você caiu em uma armadilha e perdeu %d de HP.\n", dano);
        if (hp <= 0) gameOver();
        else pausa();
        
    }

    static void descansar() {
        
        int cura = 10 + random.nextInt(20);
        hp += cura;
        if (hp > 100) hp = 100;
        System.out.printf("Você descansou e recuperou %d de HP.\n", cura);
        pausa();
        
    }

    static void loja() {
        
        while (true) {
            
            System.out.printf("Seu ouro: %d\n", ouro);
            System.out.println("Escolha o que deseja comprar:");
            System.out.println("  1. Espada (+5 Ataque) - 50 Ouro");
            System.out.println("  2. Machado (+10 Ataque) - 100 Ouro");
            System.out.println("  3. Poção (+30 HP) - 30 Ouro");
            System.out.println("  4. Voltar");
            System.out.print("Digite sua escolha (1/2/3/4): ");
            String compra = scanner.nextLine();
            
            if (compra.equals("1") && ouro >= 50) {
                
                ouro -= 50; ataque += 5; inventario = "Espada";
                System.out.println("Você comprou uma Espada.");
                
            } else if (compra.equals("2") && ouro >= 100) {
                
                ouro -= 100; ataque += 10; inventario = "Machado";
                System.out.println("Você comprou um Machado.");
                
            } else if (compra.equals("3") && ouro >= 30) {
                
                ouro -= 30; hp += 30; if (hp > 100) hp = 100;
                System.out.println("Você comprou uma Poção.");
                
            } else if (compra.equals("4")) {
                
                break;
                
            } else {
                
                System.out.println("Ouro insuficiente ou opção inválida.");
                
            }
            
            pausa() ;
            
        }
    }

    static void gameOver() {
        
        System.out.println("==========================================");
        System.out.println("              GAME OVER");
        System.out.println("Você foi derrotado em sua aventura.");
        System.out.println("==========================================");
        pausa();
        sair();
        System.exit(0);
        
    }

    static void sair() {
        
        System.out.println("==========================================");
        System.out.println("Obrigado por jogar!");
        System.out.println("==========================================");
        
    }

    static void pausa() {
        
        System.out.println("Pressione ENTER para continuar...");
        scanner.nextLine();
        
    }
}