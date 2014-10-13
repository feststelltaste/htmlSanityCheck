ruleset {

    description '''
        A Groovy RuleSet containing *many* CodeNarc Rules.
        Based upon the *sample* ruleset from the CodeNarc website.
        Just delete the rules that you don't want to include.
        '''

    AbstractClassName
    AbstractClassWithPublicConstructor
    AbstractClassWithoutAbstractMethod
    AddEmptyString
    AssertWithinFinallyBlock
    AssignCollectionSort
    AssignCollectionUnique
    AssignmentInConditional
    BigDecimalInstantiation
    BitwiseOperatorInConditional
    // BlankLineBeforePackage
    BooleanGetBoolean
    BooleanMethodReturnsNull
    BracesForClass
    BracesForForLoop
    BracesForIfElse
    BracesForMethod
    BracesForTryCatchFinally
    BrokenNullCheck
    BrokenOddnessCheck
    BuilderMethodWithSideEffects
    BusyWait
    CatchArrayIndexOutOfBoundsException
    CatchError
    CatchException
    CatchIllegalMonitorStateException
    CatchIndexOutOfBoundsException
    CatchNullPointerException
    CatchRuntimeException
    CatchThrowable
    ChainedTest
    ClassForName
    ClassJavadoc
    ClassName
    ClassNameSameAsFilename
    ClassSize
    CloneWithoutCloneable
    CloneableWithoutClone
    CloseWithoutCloseable
    ClosureAsLastMethodParameter
    ClosureStatementOnOpeningLineOfMultipleLineClosure
    CollectAllIsDeprecated
    CompareToWithoutComparable
    ComparisonOfTwoConstants
    ComparisonWithSelf
    ConfusingClassNamedException
    ConfusingMethodName
    ConfusingMultipleReturns
    ConfusingTernary
    ConsecutiveBlankLines
    ConsecutiveLiteralAppends
    ConsecutiveStringConcatenation
    ConstantAssertExpression
    ConstantIfExpression
    ConstantTernaryExpression
    ConstantsOnlyInterface
    CouldBeElvis
    CoupledTestCase
    DeadCode
    //DirectConnectionManagement
    //DoubleCheckedLocking
    DoubleNegative
    DuplicateCaseStatement
    DuplicateImport
    DuplicateListLiteral
    DuplicateMapKey
    DuplicateMapLiteral
    DuplicateNumberLiteral
    DuplicateSetValue
    DuplicateStringLiteral
    ElseBlockBraces
    EmptyCatchBlock
    EmptyClass
    EmptyElseBlock
    EmptyFinallyBlock
    EmptyForStatement
    EmptyIfStatement
    EmptyInstanceInitializer
    EmptyMethod
    EmptyMethodInAbstractClass
    EmptyStaticInitializer
    EmptySwitchStatement
    EmptySynchronizedStatement
    EmptyTryBlock
    EmptyWhileStatement
    EnumCustomSerializationIgnored
    EqualsAndHashCode
    EqualsOverloaded
    ExceptionExtendsError
    ExceptionExtendsThrowable
    ExceptionNotThrown
    ExplicitArrayListInstantiation
    ExplicitCallToAndMethod
    ExplicitCallToCompareToMethod
    ExplicitCallToDivMethod
    ExplicitCallToEqualsMethod
    ExplicitCallToGetAtMethod
    ExplicitCallToLeftShiftMethod
    ExplicitCallToMinusMethod
    ExplicitCallToModMethod
    ExplicitCallToMultiplyMethod
    ExplicitCallToOrMethod
    ExplicitCallToPlusMethod
    ExplicitCallToPowerMethod
    ExplicitCallToRightShiftMethod
    ExplicitCallToXorMethod
    ExplicitGarbageCollection
    ExplicitHashMapInstantiation
    ExplicitHashSetInstantiation
    ExplicitLinkedHashMapInstantiation
    ExplicitLinkedListInstantiation
    ExplicitStackInstantiation
    ExplicitTreeSetInstantiation
    FactoryMethodName
    FieldName
    FileCreateTempFile
    FileEndsWithoutNewline
    FinalClassWithProtectedMember
    ForLoopShouldBeWhileLoop
    ForStatementBraces
    GStringAsMapKey
    GStringExpressionWithinString
    GetterMethodCouldBeProperty
    GroovyLangImmutable
    HardCodedWindowsFileSeparator
    HardCodedWindowsRootDirectory
    HashtableIsObsolete
    IfStatementBraces
    IfStatementCouldBeTernary
    IllegalClassMember
    IllegalClassReference
    IllegalPackageReference
    IllegalRegex
    IllegalString
    IllegalSubclass
    ImplementationAsType
    ImportFromSamePackage
    ImportFromSunPackages
    InconsistentPropertyLocking
    InconsistentPropertySynchronization
    InsecureRandom
    IntegerGetInteger
    InterfaceName
    InvertedIfElse
    JUnitAssertAlwaysFails
    JUnitAssertAlwaysSucceeds
    JUnitAssertEqualsConstantActualValue
    JUnitFailWithoutMessage
    JUnitLostTest
    JUnitPublicField
    JUnitPublicNonTestMethod
    JUnitPublicProperty
    JUnitSetUpCallsSuper
    JUnitStyleAssertions
    JUnitTearDownCallsSuper
    JUnitTestMethodWithoutAssert
    JUnitUnnecessarySetUp
    JUnitUnnecessaryTearDown
    JUnitUnnecessaryThrowsException
    JavaIoPackageAccess
    JdbcConnectionReference
    JdbcResultSetReference
    JdbcStatementReference
    LineLength
    LocaleSetDefault
    LoggerForDifferentClass
    LoggerWithWrongModifiers
    LoggingSwallowsStacktrace
    LongLiteralWithLowerCaseL
    MethodCount
    MethodName
    MethodSize
    MisorderedStaticImports
    MissingBlankLineAfterImports
    MissingBlankLineAfterPackage
    MissingNewInThrowStatement
    MultipleLoggers
    MultipleUnaryOperators
    NestedBlockDepth
    NestedSynchronization
    NoWildcardImports
    NonFinalPublicField
    NonFinalSubclassOfSensitiveInterface
    ObjectFinalize
    ObjectOverrideMisspelledMethodName
    PackageName
    ParameterName
    ParameterReassignment
    PrintStackTrace
    Println
    PrivateFieldCouldBeFinal
    PropertyName
    PublicFinalizeMethod
    PublicInstanceField
    RandomDoubleCoercedToZero
    RemoveAllOnSelf
    RequiredRegex
    RequiredString
    ReturnFromFinallyBlock
    ReturnNullFromCatchBlock
    ReturnsNullInsteadOfEmptyArray
    ReturnsNullInsteadOfEmptyCollection
    SerialPersistentFields
    SerialVersionUID
    SerializableClassMustDefineSerialVersionUID
    SimpleDateFormatMissingLocale
    SpaceAfterCatch
    SpaceAfterClosingBrace
    SpaceAfterComma
    SpaceAfterFor
    SpaceAfterIf
    SpaceAfterOpeningBrace
    SpaceAfterSemicolon
    SpaceAfterSwitch
    SpaceAfterWhile
    SpaceAroundClosureArrow
    SpaceAroundMapEntryColon
    SpaceAroundOperator
    SpaceBeforeClosingBrace
    SpaceBeforeOpeningBrace
    SpockIgnoreRestUsed
    StatelessClass
    StatelessSingleton
    StaticCalendarField
    StaticConnection
    StaticDateFormatField
    StaticMatcherField
    StaticSimpleDateFormatField
    SwallowThreadDeath
    SynchronizedMethod
    SynchronizedOnBoxedPrimitive
    SynchronizedOnGetClass
    SynchronizedOnReentrantLock
    SynchronizedOnString
    SynchronizedOnThis
    SynchronizedReadObjectMethod
    SystemErrPrint
    SystemExit
    SystemOutPrint
    SystemRunFinalizersOnExit
    TernaryCouldBeElvis
    ThisReferenceEscapesConstructor
    ThreadGroup
    ThreadLocalNotStaticFinal
    ThreadYield
    ThrowError
    ThrowException
    ThrowExceptionFromFinallyBlock
    ThrowNullPointerException
    ThrowRuntimeException
    ThrowThrowable
    ToStringReturnsNull
    TrailingWhitespace
    UnnecessaryBigDecimalInstantiation
    UnnecessaryBigIntegerInstantiation
    UnnecessaryBooleanExpression
    UnnecessaryBooleanInstantiation
    UnnecessaryCallForLastElement
    UnnecessaryCallToSubstring
    UnnecessaryCast
    UnnecessaryCatchBlock
    UnnecessaryCollectCall
    UnnecessaryCollectionCall
    UnnecessaryConstructor
    UnnecessaryDefInFieldDeclaration
    UnnecessaryDefInMethodDeclaration
    UnnecessaryDefInVariableDeclaration
    UnnecessaryDotClass
    UnnecessaryDoubleInstantiation
    UnnecessaryElseStatement
    UnnecessaryFail
    UnnecessaryFinalOnPrivateMethod
    UnnecessaryFloatInstantiation
    UnnecessaryGString
    UnnecessaryGetter
    UnnecessaryGroovyImport
    UnnecessaryIfStatement
    UnnecessaryInstanceOfCheck
    UnnecessaryInstantiationToGetClass
    UnnecessaryIntegerInstantiation
    UnnecessaryLongInstantiation
    UnnecessaryModOne
    UnnecessaryNullCheck
    UnnecessaryNullCheckBeforeInstanceOf
    UnnecessaryObjectReferences
    UnnecessaryOverridingMethod
    UnnecessaryPackageReference
    UnnecessaryParenthesesForMethodCallWithClosure
    UnnecessaryPublicModifier
    UnnecessaryReturnKeyword
    UnnecessarySelfAssignment
    UnnecessarySemicolon
    UnnecessaryStringInstantiation
    UnnecessarySubstring
    UnnecessaryTernaryExpression
    UnnecessaryToString
    UnnecessaryTransientModifier
    UnsafeArrayDeclaration
    UnsafeImplementationAsMap
    UnusedArray
    UnusedImport
    UnusedMethodParameter
    UnusedObject
    UnusedPrivateField
    UnusedPrivateMethod
    UnusedPrivateMethodParameter
    UnusedVariable
    UseAssertEqualsInsteadOfAssertTrue
    UseAssertFalseInsteadOfNegation
    UseAssertNullInsteadOfAssertEquals
    UseAssertSameInsteadOfAssertTrue
    UseAssertTrueInsteadOfAssertEquals
    UseAssertTrueInsteadOfNegation
    UseCollectMany
    UseCollectNested
    UseOfNotifyMethod
    VariableName
    VectorIsObsolete
    VolatileArrayField
    VolatileLongOrDoubleField
    WaitOutsideOfWhileLoop
    WhileStatementBraces

}
