# Jogo de Ping Pong feito inteiramente em Java

Jogo de Ping Pong feito em Java pelo estudo de desenvolvimento de jogos.

![PingPong](https://user-images.githubusercontent.com/47978193/77968598-1f239600-72be-11ea-897c-a786440ad8dc.png)


## Animação

Feito com:

[x] Rectangle Class
[x] FillRect para dimensionar o retangulo e preencher com cor
[x] Color Class

## Inimigo IA

```txt
Simples IA baseada em perceguir a posição X da bola com uma taxa percentual
de erro para que nunca seja preciso e o jogador possa ter a chance de vitória.
```
## Aleatoriedade da Bola

Com a função matemática de Cosseno e Seno, consegui obter uma maior aleatoriedade no angulo Y e X da bola ao tocar no Jogador ou Inimigo.

## Tela de Morte

Ao morrer é perguntado ao jogador se quer continuar ou não.
Com JOptionPane.showConfirmDialog();

[x] Sim - O Jogo é novamente Instanciado
[x] Não - O jogo fecha com System.exit(1);

