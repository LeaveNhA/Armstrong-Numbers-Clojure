(ns armstrong-numbers)

(defn number->sequence [n]
  (map #(new Integer (str %)) (str n)))

(defn sequence->armstrong-ish [s]
  (map #(Math/pow % (count s)) s))

(defn plus-armstrong-ish [s]
  (int (reduce + s)))

(defn armstrong? [n]
  (-> n
      number->sequence
      sequence->armstrong-ish
      plus-armstrong-ish
      (= n)))