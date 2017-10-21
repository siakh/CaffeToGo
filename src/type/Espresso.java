package type;

import visitor.CaffePart;
import visitor.CaffePartVisitor;

public class Espresso implements CaffePart {

	@Override
	public void accept(CaffePartVisitor caffePartVisitor) {
		caffePartVisitor.visit(this);

	}

}
