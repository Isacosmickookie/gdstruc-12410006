public class SimpleHashTable {
    private StoredPlayer[] hashtable;

    private final StoredPlayer DELETED = new StoredPlayer(null, null);

    public SimpleHashTable()
    {
        hashtable = new StoredPlayer[10];
    }

    private int hashKey(String key)
    {
        return key.length() % hashtable.length;
    }

    public void put(String key, Player value)
    {
        int hashedKey = hashKey(key);

        if(isOccupied(hashedKey)) {
            int stoppingIndex = hashedKey;

            if (hashedKey == hashtable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }

            while (isOccupied(hashedKey) && hashedKey != stoppingIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        if (isOccupied(hashedKey))
        {
            System.out.println("there is already an element as position " + hashedKey);
        }
        else {
            hashtable[hashedKey] = new StoredPlayer(key, value);
        }
    }

    public Player get(String key)
    {
        int hashedKey = findKey(key);

        if (hashedKey == -1)
        {
            return null;
        }
        return hashtable[hashedKey].value;
    }

    private int findKey(String key)
    {
        int hashedKey = hashKey(key);

        if(hashtable[hashedKey] !=null && hashtable[hashedKey].key.equals(key))
        {
            return hashedKey;
        }


        int stoppingIndex = hashedKey;

        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while (hashedKey != stoppingIndex && hashtable[hashedKey] != null && !hashtable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if(hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key))
        {
            return hashedKey;
        }
        return -1;
    }

    public Player remove(String key)
    {
        int hashedKey = hashKey(key);

        for (int i = 0; i < hashtable.length; i++)
        {
            int index = (hashedKey + 1) % hashtable.length;

            if (hashtable[index] == null)
            {
                return null;
            }
            if (hashtable[index] != DELETED && hashtable[index].key.equals(key))
            {
                Player removedPlayer = hashtable[index].value;
                hashtable[index] = DELETED;
                return removedPlayer;
            }
        }
        return null;
    }

    private boolean isOccupied(int index)
    {
        return hashtable[index] != null;
    }

    public void printHashTable()
    {
        for (int i = 0; i < hashtable.length; i++)
        {
            System.out.println("Element " + i + " " + hashtable[i]);
        }
    }


}
