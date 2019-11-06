public class Engine {
    private String command;
    private ConsolReader reader;
    private Enemy enemy;
    private Player player;

    public Engine(ConsolReader reader, Enemy enemy, Player player) {
        this.reader = reader;
        this.enemy = enemy;
        this.player = player;
        this.command = "";
    }


    public void run() {
        long starPower = 0;
        this.command = this.reader.readLine();
        while (!command.equals("Let the Force be with you")) {
            int[] playerPosition = InputParse.readArray(this.command);
            int[] enemyPosition = InputParse.readArray(reader.readLine());
            int enemyRow = enemyPosition[0];
            int enemyCol = enemyPosition[1];

            enemy.destroyStars(enemyRow, enemyCol);

            int playerRow = playerPosition[0];
            int playerCow = playerPosition[1];

            player.star(playerRow, playerCow);

            command = reader.readLine();
        }
    }
}
