/**
 * Created by IntelliJ IDEA.
 * User: kvannotten
 * Date: Dec 2, 2010
 * Time: 11:08:01 AM
 * Kristof rulezzz and ben is gay
 */
public class Listener extends PluginListener {
		ArenaRebuilder p;

		// This controls the accessability of functions / variables from the main class.
		public Listener(ArenaRebuilder plugin) {
			p = plugin;
		}

		// remove the /* and */ from any function you want to use
		// make sure you add them to the listener above as well!

		/*
		public void onPlayerMove(Player player, Location from, Location to) {
		}
		*/

		/*
		public boolean onTeleport(Player player, Location from, Location to) {
			return false;
		}
		*/

		/*
		public String onLoginChecks(String user) {
			return null;
		}
		*/

		public void onLogin(Player player) {
			// Player Message
			player.sendMessage(Colors.Yellow + "Currently running plugin: " + p.name + " v" + p.version + "!");

			// Global Message
			p.broadcast(Colors.Green + player.getName() + " has joined the server! Wooo~");
		}

		/*
		public void onDisconnect(Player player) {
		}
		*/

		/*
		public boolean onChat(Player player, String message) {
			return false;
		}
		*/

		/*
		public boolean onCommand(Player player, String[] split) {
			return false;
		}
		*/

		/*
		public boolean onConsoleCommand(String[] split) {
			return false;
		}
		*/

		/*
		public void onBan(Player mod, Player player, String reason) {
		}
		*/

		/*
		public void onIpBan(Player mod, Player player, String reason) {
		}
		*/

		/*
		public void onKick(Player mod, Player player, String reason) {
		}
		*/

		/*
		public boolean onBlockCreate(Player player, Block blockPlaced, Block blockClicked, int itemInHand) {
			return false;
		}
		*/

		/*
		public boolean onBlockDestroy(Player player, Block block) {
			return false;
		}
		*/

		/*
		public void onArmSwing(Player player) {
		}
		*/

		/*
		public boolean onInventoryChange(Player player) {
			return false;
		}
		*/

		/*
		public boolean onComplexBlockChange(Player player, ComplexBlock block) {
			return false;
		}
		*/

		/*
		public boolean onSendComplexBlock(Player player, ComplexBlock block) {
			return false;
		}
		*/
	}
