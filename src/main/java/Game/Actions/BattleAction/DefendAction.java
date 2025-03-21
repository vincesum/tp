package Game.Actions.BattleAction;

import Exceptions.RolladieException;
import Functionalities.Storage;
import Functionalities.UI;
import Game.Actions.Action;
import Game.Game;

public class DefendAction extends BattleAction {

    @Override
    public void executeBattleAction(Game game, Storage storage, UI ui) throws RolladieException {
        String message = game.defend();
        ui.printMessage(message);
    }
}
