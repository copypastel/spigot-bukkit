package org.bukkit.entity;

/**
 * Represents a villager NPC
 */
public interface Villager extends Ageable, NPC {

    /**
     * Gets the current profession of this villager.
     *
     * @return Current profession.
     */
    public Profession getProfession();

    /**
     * Sets the new profession of this villager.
     *
     * @param profession New profession.
     */
    public void setProfession(Profession profession);

    /**
     * Gets the current career of this villager.
     *
     * @return current career. May be null if the villager has not been assigned a career.
     */
    public Career getCareer();

    /**
     * Sets the current career of this villager. Note that only certain
     * {@link Profession}'s may have certain Careers. See individual
     * {@link Career}'s for more information.
     *
     * @param career new career
     */
    public void setCareer(Career career);

    /**
     * Gets this villager's career level.
     *
     * @return their current career level
     */
    public int getCareerLevel();

    /**
     * Sets this villagers career level.
     *
     * @param level new career level.
     */
    public void setCareerLevel(int level);

    /**
     * Returns whether this villager is "willing". A willing villager will breed
     * and may offer different trades.
     *
     * @return willing status
     */
    public boolean isWilling();

    /**
     * Set the willing status defined by {@link #isWilling()}.
     *
     * @param willing new willing status
     */
    public void setWilling(boolean willing);

    /**
     * Represents the various different Villager professions there may be.
     */
    public enum Profession {
        FARMER(0),
        LIBRARIAN(1),
        PRIEST(2),
        BLACKSMITH(3),
        BUTCHER(4);

        private static final Profession[] professions = new Profession[Profession.values().length];
        private final int id;

        static {
            for (Profession type : values()) {
                professions[type.getId()] = type;
            }
        }

        private Profession(int id) {
            this.id = id;
        }

        /**
         * Gets the ID of this profession.
         *
         * @return Profession ID.
         * @deprecated Magic value
         */
        @Deprecated
        public int getId() {
            return id;
        }

        /**
         * Gets a profession by its ID.
         *
         * @param id ID of the profession to get.
         * @return Resulting profession, or null if not found.
         * @deprecated Magic value
         */
        @Deprecated
        public static Profession getProfession(int id) {
            return (id >= professions.length) ? null : professions[id];
        }
    }

    public enum Career {

        /**
         * Farmer career, may only be used by {@link Profession#FARMER}.
         */
        FARMER,
        /**
         * Fishermen career, may only be used by {@link Profession#FARMER}.
         */
        FISHERMAN,
        /**
         * Shepherd career, may only be used by {@link Profession#FARMER}.
         */
        SHEPHERD,
        /**
         * Fletcher career, may only be used by {@link Profession#FARMER}.
         */
        FLETCHER,
        /**
         * Librarian career, may only be used by {@link Profession#LIBRARIAN}.
         */
        LIBRARIAN,
        /**
         * Priest career, may only be used by {@link Profession#PRIEST}.
         */
        CLERIC,
        /**
         * Armorer career, may only be used by {@link Profession#BLACKSMITH}.
         */
        ARMOR,
        /**
         * Weapon smith career, may only be used by
         * {@link Profession#BLACKSMITH}.
         */
        WEAPON,
        /**
         * Tool smith career, may only be used by {@link Profession#BLACKSMITH}.
         */
        TOOL,
        /**
         * Butcher career, may only be used by {@link Profession#BUTCHER}.
         */
        BUTCHER,
        /**
         * Leatherworker career, may only be used by {@link Profession#BUTCHER}.
         */
        LEATHER
    }
}
