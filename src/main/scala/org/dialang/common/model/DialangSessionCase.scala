package org.dialang.common.model

case class DialangSessionCase(sessionId: String
                                , passId: String
                                , al: String
                                , tl: String
                                , skill: String
                                , vsptSubmitted: Boolean
                                , vsptSkipped: Boolean
                                , saSubmitted: Boolean
                                , saSkipped: Boolean
                                , vsptZScore: Float
                                , vsptMearaScore: Int
                                , vsptLevel: String
                                , saPPE: Float
                                , saLevel: String
                                , bookletLength: Int
                                , nextBasketId: Int
                                , scoredBasketList: List[Basket]
                                , scoredItemList: List[ImmutableItem]
                                , resultUrl: String)
