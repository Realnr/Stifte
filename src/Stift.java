public abstract class Stift {
        protected String schreibfarbe;
        protected boolean kaputt;

        public Stift(String schreibfarbe){
            this.schreibfarbe=schreibfarbe;
            kaputt=false;
        }

        public abstract void gibSchreibfarbeAus();

        public boolean istNutzbar(){
            return !kaputt;
        }
    }
