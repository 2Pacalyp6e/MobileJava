public class Player extends Game {
    MainGameForm gameField;
    int isShotReady = 1;

    public Player(String sign)
    {
        this.sign = sign;
    }

    boolean shot(int x, int y)
    {
        gameField = MainGameForm.getInstance();
        if (!gameField.isCellBusy(x, y))
        {
            gameField.cell[x][y] = sign;
            return true;
        }
        return false;
    }

    boolean win()
    {
        gameField = MainGameForm.getInstance();
        return gameField.checkWin(this.sign);
    }
}