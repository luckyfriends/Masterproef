package masterproef.cards

import org.newdawn.slick.Image
import masterproef.Masterproef
import org.newdawn.slick.gui.GUIContext
import org.newdawn.slick.Graphics

class Mountain extends Land {

	override def copy(): Mountain = {
		new Mountain() called name is_owned_by owner requires requirements
	}

	_frontImage = new Image(Masterproef.getClass().getResourceAsStream("/masterproef/assets/cards/lands/Mountain_small.png"), "mountainFront", false)

}