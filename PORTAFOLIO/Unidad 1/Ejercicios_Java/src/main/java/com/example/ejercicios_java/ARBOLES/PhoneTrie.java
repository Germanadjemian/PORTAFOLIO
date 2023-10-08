package com.example.ejercicios_java.ARBOLES;

import java.util.HashMap;
import java.util.Map;

public class PhoneTrie {
    private TrieNode root;

    public PhoneTrie() {
        root = new TrieNode();
    }

    // Inserta un número de teléfono en el trie
    public void insert(String phoneNumber) {
        TrieNode node = root;
        for (char c : phoneNumber.toCharArray()) {
            node.children.putIfAbsent(c, new TrieNode());
            node = node.children.get(c);
        }
        node.isEndOfWord = true;
    }

    // Retorna si el trie contiene el número de teléfono especificado
    public boolean contains(String phoneNumber) {
        TrieNode node = root;
        for (char c : phoneNumber.toCharArray()) {
            if (!node.children.containsKey(c)) {
                return false;
            }
            node = node.children.get(c);
        }
        return node.isEndOfWord;
    }

    // Predice los números de teléfono que coinciden con el prefijo especificado
    public void predict(String prefix) {
        TrieNode node = root;
        for (char c : prefix.toCharArray()) {
            if (!node.children.containsKey(c)) {
                System.out.println("No se encontraron coincidencias para el prefijo " + prefix);
                return;
            }
            node = node.children.get(c);
        }
        printNumbers(node, prefix);
    }

    // Imprime los números de teléfono que comienzan con el nodo especificado
    private void printNumbers(TrieNode node, String prefix) {
        if (node.isEndOfWord) {
            System.out.println(prefix);
        }
        for (char c : node.children.keySet()) {
            printNumbers(node.children.get(c), prefix + c);
        }
    }

    // Clase interna para representar los nodos del trie
    private static class TrieNode {
        private Map<Character, TrieNode> children;
        private boolean isEndOfWord;

        public TrieNode() {
            children = new HashMap<>();
            isEndOfWord = false;
        }
    }

    public static void main(String[] args) {
        PhoneTrie trie = new PhoneTrie();
        trie.insert("1234567890");
        trie.insert("1234567891");
        trie.insert("1234567892");
        trie.insert("1234567893");
        trie.insert("2345678901");
        trie.insert("2345678902");
        trie.insert("3456789012");

        System.out.println(trie.contains("1234567890")); // true
        System.out.println(trie.contains("2345678903")); // false

        trie.predict("123"); // Imprime los números de teléfono que comienzan con el prefijo "123"
    }


}
