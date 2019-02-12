val bad="_test__string1_"
val good = "snake_case"
val reg: String = "[a-z_]*"
bad.matches(reg)
good.matches(reg)

