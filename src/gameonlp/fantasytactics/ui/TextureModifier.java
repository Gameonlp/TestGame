package gameonlp.fantasytactics.ui;

import gameonlp.fantasytactics.Updatable;

public interface TextureModifier extends Updatable {
    Texture modify(Texture t);
}
