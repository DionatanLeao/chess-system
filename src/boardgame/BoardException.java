package boardgame;

/***
 * 
 * @author dionatan
 *
 */

public class BoardException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	BoardException(String msg) {
		super(msg);
	}
}
