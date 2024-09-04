package com.walcker.logicchallange.uberSearchWords

fun main() {
    val wordDictionary = WordDictionary()
    wordDictionary.addWord("bad")
    wordDictionary.addWord("dad")
    wordDictionary.addWord("mad")
    println(wordDictionary.search("pad")) // false
    println(wordDictionary.search("bad")) // true
    println(wordDictionary.search(".ad")) // true
    println(wordDictionary.search("b..")) // true
}

class WordDictionary {
    private val words = mutableListOf<String>()

    fun addWord(word: String) {
        words.add(word)
    }

    fun search(word: String): Boolean {
        return words.any {
            match(it, word)
        }
    }

    private fun match(word: String, pattern: String): Boolean {
        if (word.length != pattern.length) return false
        for (i in word.indices) {
            if (pattern[i] != '.' && word[i] != pattern[i]) {
                return false
            }
        }
        return true
    }
}