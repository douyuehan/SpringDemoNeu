package com.moonlit.myspring;

/**
 * Created by Administrator on 2018/11/22.
 */
public class PoeticJugger extends Juggler {
    private Poem poem;

    public PoeticJugger(int bags, Poem poem) {
        super(bags);
        this.poem = poem;
    }

    public PoeticJugger(Poem poem)
    {
        super(6);
        this.poem = poem;
    }

    @Override
    public void perform() {
        super.perform();
        poem.recite();
    }
}

