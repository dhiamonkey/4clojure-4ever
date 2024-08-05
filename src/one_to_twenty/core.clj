(ns one-to-twenty.core
   (:require [clojure.string]
             )
  (:gen-class))


;; Problem 1, Nothing but the Truth
;; Complete the expression so it will evaluate to true.
;; (= __ true)

true

;; Problem 2, Simple Math
;; Difficulty: elementary
;; Innermost forms are evaluated first.

;; (= (- 10 (* 2 3)) __)

4


;; Problem 3, Strings
;; Difficulty: elementary
;; Clojure strings are Java strings, so you can use Java string methods on them.

;; (= __ (.toUpperCase "hello world"))

"HELLO WORLD"


;; Problem 4, Lists
;; Difficulty: elementary
;; Lists can be constructed with either a function or a quoted form.

;; (= (list __) '(:a :b :c))

:a :b :c

;; Problem 5, conj on lists
;; Difficulty: elementary
;; When operating on a list, the conj function will return a new list with one or more items "added" to the front.

;; (= __ (conj '(2 3 4) 1))
;; (= __ (conj '(3 4) 2 1))

'(1 2 3 4)

;; Problem 6, Vectors
;; Difficulty: elementary
;; Vectors can be constructed several ways. You can compare them with lists.

;; (= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))

[:a :b :c]

;; Problem 7, conj on vectors
;; Difficulty: elementary
;; When operating on a Vector, the conj function will return a new vector with one or more items "added" to the end.

;; (= __ (conj [1 2 3] 4))
;; (= __ (conj [1 2] 3 4))


[1 2 3 4]

;; Problem 8, Sets
;; Difficulty: elementary
;; Sets are collections of unique values.

;; (= __ (set '(:a :a :b :c :c :c :c :d :d)))
;; (= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))

#{:a :b :c :d}

;; Problem 9, conj on sets
;; Difficulty: elementary
;; When operating on a set, the conj function returns a new set with one or more keys "added".

;; (= #{1 2 3 4} (conj #{1 4 3} __))

2

;; Problem 10, Maps
;; Difficulty: elementary
;; Maps store key-value pairs. Both maps and keywords can be used as lookup functions. Commas are whitespace.

;; (= __ ((hash-map :a 10, :b 20, :c 30) :b))
;; (= __ (:b {:a 10, :b 20, :c 30}))

20

;; Problem 11, conj on maps
;; Difficulty: elementary
;; When operating on a map, the conj function returns a new map with one or more key-value pairs "added".

;; (= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3]))

{:b 2}

;; Problem 12, Sequences
;; Difficulty: elementary
;; All Clojure collections support sequencing. You can operate on sequences with functions like first, second, and last.

;; (= __ (first '(3 2 1)))
;; (= __ (second [2 3 4]))
;; (= __ (last (list 1 2 3)))

3

;; Problem 13, rest
;; Difficulty: elementary
;; The rest function will return all the items of a sequence except the first.

;; (= __ (rest [10 20 30 40]))

[20 30 40]

;; Problem 14, Functions
;; Difficulty: elementary
;; Clojure has many different ways to create functions.

;; (= __ ((fn add-five [x] (+ x 5)) 3))
;; (= __ ((fn [x] (+ x 5)) 3))
;; (= __ (#(+ % 5) 3))
;; (= __ ((partial + 5) 3))

8

;; Problem 15, Double Down
;; Difficulty: elementary
;; Write a function which doubles a number.

;; (= (__ 2) 4)
;; (= (__ 3) 6)
;; (= (__ 11) 22)
;; (= (__ 7) 14)

(fn [x] (* x 2))

;; Problem 16, Hello World
;; Difficulty: elementary
;; Write a function which returns a personalized greeting.

;; (= (__ "Dave") "Hello, Dave!")
;; (= (__ "Jenn") "Hello, Jenn!")
;; (= (__ "Rhea") "Hello, Rhea!")

(fn
   [x]
   (clojure.string/join "" ["Hello, " x "!"]))


;; Problem 17, map
;; Difficulty: elementary
;; The map function takes two arguments: a function (f) and a sequence (s). Map returns a new sequence consisting of the result of applying f to each item of s. Do not confuse the map function with the map data structure.

(map #(+ % 5) '(1 2 3))
;; => (6 7 8)


;; Problem 18, filter
;; Difficulty: elementary
;; The filter function takes two arguments: a predicate function (f) and a sequence (s). Filter returns a new sequence consisting of all the items of s for which (f item) returns true.

;; (= __ (filter #(> % 5) '(3 4 5 6 7)))

(filter #(> % 5) '(3 4 5 6 7))
;; => (6 7)

;; Problem 19, Last Element
;; Difficulty: easy
;; Write a function which returns the last element in a sequence.

;; (= (__ [1 2 3 4 5]) 5)
;; (= (__ '(5 4 3)) 3)
;; (= (__ ["b" "c" "d"]) "d")
;; Special Restrictions : last

(#(first (reverse %)))

;; Problem 20, Penultimate Element
;; Difficulty: easy
;; Write a function which returns the second to last element from a sequence.

;; (= (__ (list 1 2 3 4 5)) 4)
;; (= (__ ["a" "b" "c"]) "b")
;; (= (__ [[1 2] [3 4]]) [1 2])

(#(second (reverse %)))
