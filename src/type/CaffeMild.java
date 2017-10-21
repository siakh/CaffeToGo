package type;

import visitor.CaffePart;
import visitor.CaffePartVisitor;

public class CaffeMild implements CaffePart {

	@Override
	public void accept(CaffePartVisitor caffePartVisitor) {
		caffePartVisitor.visit(this);

	}

}
