/*

package upgradeableevents.patches;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePostfixPatch;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.saveAndContinue.SaveFile;
import upgradeableevents.UpgradeEventManager;

@SpirePatch(clz = AbstractDungeon.class, method = "nextRoomTransition", paramtypez = {SaveFile.class})
public class RoomTransitionPatch {
    @SpirePostfixPatch
    public static void Postfix(AbstractDungeon __instance, SaveFile saveFile) {
        UpgradeEventManager.reset();
    }
}

 */