package grello

class BoardController extends SecureController{

    //def scaffold = Board;
	
	
	def index(Integer max){
		params.max = Math.min(max ?: 10, 100);
		[boardInstanceCount: Board.count(), boardInstanceList: Board.list(params)];
	}
	
	
	
}
