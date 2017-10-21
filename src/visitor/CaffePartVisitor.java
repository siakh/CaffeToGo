package visitor;
import type.*;
import unit.*;

public interface CaffePartVisitor {
	public void visit (Caffe caffe);
	public void visit (Espresso espresso);
	public void visit (Sugar sugar);
	public void visit (CaffeMild caffeMild);
	public void visit (Milk milk);

}
