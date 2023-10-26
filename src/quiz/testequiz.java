package quiz;

import java.util.Scanner;

public class testequiz {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);


        cabecalho cabecalho1 = new cabecalho();
        System.out.println("===========================================================================================");
        cabecalho1.facudade = "FACUDADE: UNIFAN";
        cabecalho1.nome = "NOME: David Oliveira Silva";

        cabecalho1.professor = "PROFESSOR: Brenno";

        cabecalho1.materia = "MATERIA: Algoritmos e programação II";

        cabecalho1.escrevaCabecalho();
        System.out.println("===========================================================================================");

        int acertos = 0;


        questoes questoes1 = new questoes();

        questoes1.pergunta = "1-)qual o maior campeao da copa do brasil";
        questoes1.opcaoA = "A-)flamengo";
        questoes1.opcaoB = "B-)palmeiras";
        questoes1.opcaoC = "C-)gremio";
        questoes1.opcaoD = "D-)cruzeiro";
        questoes1.opcaoE = "E-)santos";
        questoes1.escrevaQuestoes();
        questoes1.correta = "d";
        System.out.println("digite a resposta correta");
        String resposta = leia.nextLine();
        if (resposta.equals(questoes1.iscorreta(resposta))) {
        } else {
        }
        if (resposta.equals(questoes1.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos :" + acertos);
        } else {
            System.out.println("acertos :" + acertos);

        }
        System.out.println("========================================================================================");

        questoes questoes2 = new questoes();

        questoes2.pergunta = "2-)Qual a seleçao que mais ganhou copas do mundo";
        questoes2.opcaoA = "A-)Brasil";
        questoes2.opcaoB = "B-)Alemanha";
        questoes2.opcaoC = "C-)Italia";
        questoes2.opcaoD = "D-)França";
        questoes2.opcaoE = "E-)portugal";
        questoes2.escrevaQuestoes();
        questoes2.correta = "a";
        System.out.println("digite a resposta correta");
        String resposta2 = leia.nextLine();
        if (resposta.equals(questoes2.iscorreta(resposta2))) {
        } else {

        }
        if (resposta2.equals(questoes2.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos :" + acertos);
        } else {
            System.out.println("acertos :" + acertos);

        }



        System.out.println("========================================================================================");

        questoes questoes3 = new questoes();

        questoes3.pergunta = "3-)qual eo maior artilheiro da champions league:?";
        questoes3.opcaoA = "A-)Lionel Messi";
        questoes3.opcaoB = "B-)Benzemar";
        questoes3.opcaoC = "C-)Cristiano Ronaldo";
        questoes3.opcaoD = "D-)Ronaldinho";
        questoes3.opcaoE = "E-)Neymar Jr";
        questoes3.escrevaQuestoes();
        questoes3.correta = "c";
        System.out.println("digite a resposta correta");
        String resposta3 = leia.nextLine();
        if (resposta.equals(questoes3.iscorreta(resposta3))) {
        } else {

        }
        if (resposta3.equals(questoes3.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos :" + acertos);
        } else {
            System.out.println("acertos :" + acertos);

        }

        System.out.println("========================================================================================");

        questoes questoes4 = new questoes();

        questoes4.pergunta = "4-)Qual maior campeão da libertadores na Amaerica do sul?)";
        questoes4.opcaoA = "A-)Independente";
        questoes4.opcaoB = "B-)Flamengo";
        questoes4.opcaoC = "C-)Boca juniors";
        questoes4.opcaoD = "D-)River plate";
        questoes4.opcaoE = "E-)Santos";
        questoes4.escrevaQuestoes();
        questoes4.correta = "a";
        System.out.println("digite a resposta correta");
        String resposta4 = leia.nextLine();
        if (resposta.equals(questoes4.iscorreta(resposta4))) {
        } else {

        }
        if (resposta4.equals(questoes4.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos :" + acertos);
        } else {
            System.out.println("acertos :" + acertos);

        }
        System.out.println("========================================================================================");

        questoes questoes5 = new questoes();

        questoes5.pergunta = "5-)Quem tem mais titulos do campeonato Brasileiro serie A?";
        questoes5.opcaoA = "A-)Atletico Mineiro";
        questoes5.opcaoB = "B-)Santos";
        questoes5.opcaoC = "C-)São Paulo";
        questoes5.opcaoD = "D-)Corithians";
        questoes5.opcaoE = "E-)Palmeiras";
        questoes5.escrevaQuestoes();
        questoes5.correta = "e";
        System.out.println("digite a resposta correta");
        String resposta5 = leia.nextLine();
        if (resposta.equals(questoes5.iscorreta(resposta5))) {
        } else {

        }
        if (resposta5.equals(questoes5.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos :" + acertos);
        } else {
            System.out.println("acertos :" + acertos);

        }
        System.out.println("========================================================================================");

        questoes questoes6 = new questoes();

        questoes6.pergunta = "6-)Qual é o jogador com mais bolas de ouro da historia";
        questoes6.opcaoA = "A-)Cristiano Ronaldo";
        questoes6.opcaoB = "B-)Messi";
        questoes6.opcaoC = "C-)Romario";
        questoes6.opcaoD = "D-)Ronaldo fenomêno";
        questoes6.opcaoE = "E-)neymar";
        questoes6.escrevaQuestoes();
        questoes6.correta = "b";
        System.out.println("digite a resposta correta");
        String resposta6 = leia.nextLine();
        if (resposta.equals(questoes6.iscorreta(resposta6))) {
        } else {

        }
        if (resposta6.equals(questoes6.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos :" + acertos);
        } else {
            System.out.println("acertos :" + acertos);

        }
        System.out.println("========================================================================================");

        questoes questoes7 = new questoes();

        questoes7.pergunta = "7-)Qual o unico jogador da historia a conquistar 3 copas do mundo?";
        questoes7.opcaoA = "A-)cafu";
        questoes7.opcaoB = "B-)Messi";
        questoes7.opcaoC = "C-)Pele";
        questoes7.opcaoD = "D-)Garrincha";
        questoes7.opcaoE = "E-)bebeto";
        questoes7.escrevaQuestoes();
        questoes7.correta = "c";
        System.out.println("digite a resposta correta");
        String resposta7 = leia.nextLine();
        if (resposta.equals(questoes7.iscorreta(resposta7))) {
        } else {

        }
        if (resposta7.equals(questoes7.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos :" + acertos);
        } else {
            System.out.println("acertos :" + acertos);

        }
        System.out.println("========================================================================================");

        questoes questoes8 = new questoes();

        questoes8.pergunta = "8-Qual o segundo time com mais champions league ";
        questoes8.opcaoA = "A-)Bayer de munich";
        questoes8.opcaoB = "B-)Milan";
        questoes8.opcaoC = "C-)Barcelona";
        questoes8.opcaoD = "D-)chealsea";
        questoes8.opcaoE = "E-)liverpool";
        questoes8.escrevaQuestoes();
        questoes8.correta = "b";
        System.out.println("digite a resposta correta");
        String resposta8 = leia.nextLine();
        if (resposta.equals(questoes8.iscorreta(resposta8))) {
        } else {

        }
        if (resposta8.equals(questoes8.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos :" + acertos);
        } else {
            System.out.println("acertos :" + acertos);

        }
        System.out.println("========================================================================================");

        questoes questoes9 = new questoes();

        questoes9.pergunta = "9-Qual dos times abaixo nunca ganharam uma copa do brasil? ";
        questoes9.opcaoA = "A-)São Paulo";
        questoes9.opcaoB = "B-)Flamengo";
        questoes9.opcaoC = "C-)Corinthians";
        questoes9.opcaoD = "D-)Vasco";
        questoes9.opcaoE = "E-)Gremio";
        questoes9.escrevaQuestoes();
        questoes9.correta = "a";
        System.out.println("digite a resposta correta");
        String resposta9 = leia.nextLine();
        if (resposta.equals(questoes9.iscorreta(resposta9))) {
        } else {

        }
        if (resposta9.equals(questoes9.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos :" + acertos);
        } else {
            System.out.println("acertos :" + acertos);

        }
        System.out.println("========================================================================================");

        questoes questoes10 = new questoes();

        questoes10.pergunta = "10-Quais é o jogador com mais gols no campeonato Brasileiro? ";
        questoes10.opcaoA = "A-)Zico";
        questoes10.opcaoB = "B-)Roberto Dinamite";
        questoes10.opcaoC = "C-)Fred";
        questoes10.opcaoD = "D-)Edmundo";
        questoes10.opcaoE = "E-)Roamrio";
        questoes10.escrevaQuestoes();
        questoes10.correta = "b";
        System.out.println("digite a resposta correta");
        String resposta10 = leia.nextLine();
        if (resposta.equals(questoes10.iscorreta(resposta10))) {
        } else {

        }
        if (resposta10.equals(questoes10.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos :" + acertos);
        } else {
            System.out.println("acertos :" + acertos);

        }
        System.out.println("========================================================================================");

        questoes questoes11 = new questoes();

        questoes11.pergunta = "11-) Qual eo maior artilheiro da copa do brasil ?";
        questoes11.opcaoA = "A-)Fred";
        questoes11.opcaoB = "B-)Romario";
        questoes11.opcaoC = "C-)Gabigol";
        questoes11.opcaoD = "D-)Luis fabiano";
        questoes11.opcaoE = "E-)Diego Souza";
        questoes11.escrevaQuestoes();
        questoes11.correta = "a";
        System.out.println("digite a resposta correta");
        String resposta11 = leia.nextLine();
        if (resposta.equals(questoes11.iscorreta(resposta11))) {
        } else {

        }
        if (resposta11.equals(questoes11.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos :" + acertos);
        } else {
            System.out.println("acertos :" + acertos);

        }
        System.out.println("========================================================================================");

        questoes questoes12 = new questoes();

        questoes12.pergunta = "12-Qual o time com mais Europa league?";
        questoes12.opcaoA = "A-)Inter de Milão";
        questoes12.opcaoB = "B-)liverpool";
        questoes12.opcaoC = "C-)Manchister City";
        questoes12.opcaoD = "D-)Real madrid";
        questoes12.opcaoE = "E-)Sevilla";
        questoes12.escrevaQuestoes();
        questoes12.correta = "e";
        System.out.println("digite a resposta correta");
        String resposta12 = leia.nextLine();
        if (resposta.equals(questoes12.iscorreta(resposta12))) {
        } else {

        }
        if (resposta12.equals(questoes12.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos :" + acertos);
        } else {
            System.out.println("acertos :" + acertos);

        }
        System.out.println("========================================================================================");

        questoes questoes13 = new questoes();

        questoes13.pergunta = "13-)Qual dos times abaxos nunca foram rebaixados da serie A do brasileirao?";
        questoes13.opcaoA = "A-)Palmeiras,corithians e São Paulo";
        questoes13.opcaoB = "B-)Flamengo,Santos e Fluminense";
        questoes13.opcaoC = "C-)Vasco,Cruzeiro e Botafago";
        questoes13.opcaoD = "D-)Flamengo,Santos e São Paulo";
        questoes13.opcaoE = "E-)Gremio,Atletico mineiro e Santos";
        questoes13.escrevaQuestoes();
        questoes13.correta = "d";
        System.out.println("digite a resposta correta");
        String resposta13 = leia.nextLine();
        if (resposta.equals(questoes13.iscorreta(resposta13))) {
        } else {

        }
        if (resposta13.equals(questoes13.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos :" + acertos);
        } else {
            System.out.println("acertos :" + acertos);

        }
        System.out.println("========================================================================================");

        questoes questoes14 = new questoes();

        questoes14.pergunta = "14-)Qual time do Brasil tem mais Mundial de clubes?";
        questoes14.opcaoA = "A-)Palmeiras";
        questoes14.opcaoB = "B-)Santos";
        questoes14.opcaoC = "C-)Vasco";
        questoes14.opcaoD = "D-)São Paulo";
        questoes14.opcaoE = "E-)Gremio";
        questoes14.escrevaQuestoes();
        questoes14.correta = "d";
        System.out.println("digite a resposta correta");
        String resposta14 = leia.nextLine();
        if (resposta.equals(questoes14.iscorreta(resposta14))) {
        } else {

        }
        if (resposta14.equals(questoes14.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos :" + acertos);
        } else {
            System.out.println("acertos :" + acertos);

        }
        System.out.println("========================================================================================");

        questoes questoes15 = new questoes();

        questoes15.pergunta = "15-)QUal jogador com mais gols em Copas do Mundo?";
        questoes15.opcaoA = "A-)Klose";
        questoes15.opcaoB = "B-)Ronaldo Fenomeno";
        questoes15.opcaoC = "C-)Pele";
        questoes15.opcaoD = "D-)Zico";
        questoes15.opcaoE = "E-)Messi";
        questoes15.escrevaQuestoes();
        questoes15.correta = "a";
        System.out.println("digite a resposta correta");
        String resposta15 = leia.nextLine();
        if (resposta.equals(questoes15.iscorreta(resposta15))) {
        } else {

        }
        if (resposta15.equals(questoes15.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos :" + acertos);
        } else {
            System.out.println("acertos :" + acertos);

        }
        System.out.println("========================================================================================");

        System.out.println("você acertou " + acertos + " de 15 perguntas");
        if (acertos <= 5) {
            System.out.println("TENTE NOVAMENTE!!!! VOCÊ FOI MAL DEMAIS ");
        }
        if (acertos < 10 & acertos > 5) {
            System.out.println("VOCÊ FOI REGULAR");
        }
        if (acertos > 10 & acertos <= 14) {
            System.out.println("PAREBENS VOCÊ FOI MUITO BEM");
        }
        if (acertos > 14) {
            System.out.println("PAREBENS VOCÊ FOI  EXCELENTE");

        }


    }
}

