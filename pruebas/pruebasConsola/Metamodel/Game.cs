//------------------------------------------------------------------------------
// <auto-generated>
//     Este código fue generado por una herramienta.
//     Versión de runtime:4.0.30319.42000
//
//     Los cambios en este archivo podrían causar un comportamiento incorrecto y se perderán si
//     se vuelve a generar el código.
// </auto-generated>
//------------------------------------------------------------------------------

using NMF.Collections.Generic;
using NMF.Collections.ObjectModel;
using NMF.Expressions;
using NMF.Expressions.Linq;
using NMF.Models;
using NMF.Models.Collections;
using NMF.Models.Expressions;
using NMF.Models.Meta;
using NMF.Serialization;
using NMF.Utilities;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Collections.Specialized;
using System.ComponentModel;
using System.Diagnostics;
using System.Linq;

namespace pruebasConsola.GameCreator
{
    
    
    /// <summary>
    /// The default implementation of the Game class
    /// </summary>
    [XmlNamespaceAttribute("GameCreator")]
    [XmlNamespacePrefixAttribute("GameCreator")]
    public partial class Game : ModelElement, IGame, IModelElement
    {
        
        /// <summary>
        /// The backing field for the WelcomeMsg property
        /// </summary>
        [DebuggerBrowsableAttribute(DebuggerBrowsableState.Never)]
        private string _welcomeMsg;
        
        private static Lazy<ITypedElement> _welcomeMsgAttribute = new Lazy<ITypedElement>(RetrieveWelcomeMsgAttribute);
        
        private static Lazy<ITypedElement> _locationsReference = new Lazy<ITypedElement>(RetrieveLocationsReference);
        
        /// <summary>
        /// The backing field for the Locations property
        /// </summary>
        [DebuggerBrowsableAttribute(DebuggerBrowsableState.Never)]
        private ObservableCompositionOrderedSet<ILocation> _locations;
        
        private static Lazy<ITypedElement> _testsReference = new Lazy<ITypedElement>(RetrieveTestsReference);
        
        /// <summary>
        /// The backing field for the Tests property
        /// </summary>
        [DebuggerBrowsableAttribute(DebuggerBrowsableState.Never)]
        private ObservableCompositionOrderedSet<ITest> _tests;
        
        private static Lazy<ITypedElement> _initialTestReference = new Lazy<ITypedElement>(RetrieveInitialTestReference);
        
        /// <summary>
        /// The backing field for the InitialTest property
        /// </summary>
        [DebuggerBrowsableAttribute(DebuggerBrowsableState.Never)]
        private ITest _initialTest;
        
        private static IClass _classInstance;
        
        public Game()
        {
            this._locations = new ObservableCompositionOrderedSet<ILocation>(this);
            this._locations.CollectionChanging += this.LocationsCollectionChanging;
            this._locations.CollectionChanged += this.LocationsCollectionChanged;
            this._tests = new ObservableCompositionOrderedSet<ITest>(this);
            this._tests.CollectionChanging += this.TestsCollectionChanging;
            this._tests.CollectionChanged += this.TestsCollectionChanged;
        }
        
        /// <summary>
        /// The welcomeMsg property
        /// </summary>
        [DisplayNameAttribute("welcomeMsg")]
        [CategoryAttribute("Game")]
        [XmlElementNameAttribute("welcomeMsg")]
        [XmlAttributeAttribute(true)]
        public string WelcomeMsg
        {
            get
            {
                return this._welcomeMsg;
            }
            set
            {
                if ((this._welcomeMsg != value))
                {
                    string old = this._welcomeMsg;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnWelcomeMsgChanging(e);
                    this.OnPropertyChanging("WelcomeMsg", e, _welcomeMsgAttribute);
                    this._welcomeMsg = value;
                    this.OnWelcomeMsgChanged(e);
                    this.OnPropertyChanged("WelcomeMsg", e, _welcomeMsgAttribute);
                }
            }
        }
        
        /// <summary>
        /// The locations property
        /// </summary>
        [LowerBoundAttribute(1)]
        [DesignerSerializationVisibilityAttribute(DesignerSerializationVisibility.Content)]
        [BrowsableAttribute(false)]
        [XmlElementNameAttribute("locations")]
        [XmlAttributeAttribute(false)]
        [ContainmentAttribute()]
        [ConstantAttribute()]
        public IOrderedSetExpression<ILocation> Locations
        {
            get
            {
                return this._locations;
            }
        }
        
        /// <summary>
        /// The tests property
        /// </summary>
        [DesignerSerializationVisibilityAttribute(DesignerSerializationVisibility.Content)]
        [BrowsableAttribute(false)]
        [XmlElementNameAttribute("tests")]
        [XmlAttributeAttribute(false)]
        [ContainmentAttribute()]
        [ConstantAttribute()]
        public IOrderedSetExpression<ITest> Tests
        {
            get
            {
                return this._tests;
            }
        }
        
        /// <summary>
        /// The initialTest property
        /// </summary>
        [BrowsableAttribute(false)]
        [XmlElementNameAttribute("initialTest")]
        [XmlAttributeAttribute(false)]
        [ContainmentAttribute()]
        public ITest InitialTest
        {
            get
            {
                return this._initialTest;
            }
            set
            {
                if ((this._initialTest != value))
                {
                    ITest old = this._initialTest;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnInitialTestChanging(e);
                    this.OnPropertyChanging("InitialTest", e, _initialTestReference);
                    this._initialTest = value;
                    if ((old != null))
                    {
                        old.Parent = null;
                        old.ParentChanged -= this.OnResetInitialTest;
                    }
                    if ((value != null))
                    {
                        value.Parent = this;
                        value.ParentChanged += this.OnResetInitialTest;
                    }
                    this.OnInitialTestChanged(e);
                    this.OnPropertyChanged("InitialTest", e, _initialTestReference);
                }
            }
        }
        
        /// <summary>
        /// Gets the child model elements of this model element
        /// </summary>
        public override IEnumerableExpression<IModelElement> Children
        {
            get
            {
                return base.Children.Concat(new GameChildrenCollection(this));
            }
        }
        
        /// <summary>
        /// Gets the referenced model elements of this model element
        /// </summary>
        public override IEnumerableExpression<IModelElement> ReferencedElements
        {
            get
            {
                return base.ReferencedElements.Concat(new GameReferencedElementsCollection(this));
            }
        }
        
        /// <summary>
        /// Gets fired before the WelcomeMsg property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> WelcomeMsgChanging;
        
        /// <summary>
        /// Gets fired when the WelcomeMsg property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> WelcomeMsgChanged;
        
        /// <summary>
        /// Gets fired before the InitialTest property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> InitialTestChanging;
        
        /// <summary>
        /// Gets fired when the InitialTest property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> InitialTestChanged;
        
        private static ITypedElement RetrieveWelcomeMsgAttribute()
        {
            return ((ITypedElement)(((ModelElement)(pruebasConsola.GameCreator.Game.ClassInstance)).Resolve("welcomeMsg")));
        }
        
        /// <summary>
        /// Raises the WelcomeMsgChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnWelcomeMsgChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.WelcomeMsgChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the WelcomeMsgChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnWelcomeMsgChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.WelcomeMsgChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        private static ITypedElement RetrieveLocationsReference()
        {
            return ((ITypedElement)(((ModelElement)(pruebasConsola.GameCreator.Game.ClassInstance)).Resolve("locations")));
        }
        
        /// <summary>
        /// Forwards CollectionChanging notifications for the Locations property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void LocationsCollectionChanging(object sender, NotifyCollectionChangedEventArgs e)
        {
            this.OnCollectionChanging("Locations", e, _locationsReference);
        }
        
        /// <summary>
        /// Forwards CollectionChanged notifications for the Locations property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void LocationsCollectionChanged(object sender, NotifyCollectionChangedEventArgs e)
        {
            this.OnCollectionChanged("Locations", e, _locationsReference);
        }
        
        private static ITypedElement RetrieveTestsReference()
        {
            return ((ITypedElement)(((ModelElement)(pruebasConsola.GameCreator.Game.ClassInstance)).Resolve("tests")));
        }
        
        /// <summary>
        /// Forwards CollectionChanging notifications for the Tests property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void TestsCollectionChanging(object sender, NotifyCollectionChangedEventArgs e)
        {
            this.OnCollectionChanging("Tests", e, _testsReference);
        }
        
        /// <summary>
        /// Forwards CollectionChanged notifications for the Tests property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void TestsCollectionChanged(object sender, NotifyCollectionChangedEventArgs e)
        {
            this.OnCollectionChanged("Tests", e, _testsReference);
        }
        
        private static ITypedElement RetrieveInitialTestReference()
        {
            return ((ITypedElement)(((ModelElement)(pruebasConsola.GameCreator.Game.ClassInstance)).Resolve("initialTest")));
        }
        
        /// <summary>
        /// Raises the InitialTestChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnInitialTestChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.InitialTestChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the InitialTestChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnInitialTestChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.InitialTestChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Handles the event that the InitialTest property must reset
        /// </summary>
        /// <param name="sender">The object that sent this reset request</param>
        /// <param name="eventArgs">The event data for the reset event</param>
        private void OnResetInitialTest(object sender, System.EventArgs eventArgs)
        {
            this.InitialTest = null;
        }
        
        /// <summary>
        /// Gets the relative URI fragment for the given child model element
        /// </summary>
        /// <returns>A fragment of the relative URI</returns>
        /// <param name="element">The element that should be looked for</param>
        protected override string GetRelativePathForNonIdentifiedChild(IModelElement element)
        {
            int locationsIndex = ModelHelper.IndexOfReference(this.Locations, element);
            if ((locationsIndex != -1))
            {
                return ModelHelper.CreatePath("locations", locationsIndex);
            }
            int testsIndex = ModelHelper.IndexOfReference(this.Tests, element);
            if ((testsIndex != -1))
            {
                return ModelHelper.CreatePath("tests", testsIndex);
            }
            if ((element == this.InitialTest))
            {
                return ModelHelper.CreatePath("InitialTest");
            }
            return base.GetRelativePathForNonIdentifiedChild(element);
        }
        
        /// <summary>
        /// Resolves the given URI to a child model element
        /// </summary>
        /// <returns>The model element or null if it could not be found</returns>
        /// <param name="reference">The requested reference name</param>
        /// <param name="index">The index of this reference</param>
        protected override IModelElement GetModelElementForReference(string reference, int index)
        {
            if ((reference == "LOCATIONS"))
            {
                if ((index < this.Locations.Count))
                {
                    return this.Locations[index];
                }
                else
                {
                    return null;
                }
            }
            if ((reference == "TESTS"))
            {
                if ((index < this.Tests.Count))
                {
                    return this.Tests[index];
                }
                else
                {
                    return null;
                }
            }
            if ((reference == "INITIALTEST"))
            {
                return this.InitialTest;
            }
            return base.GetModelElementForReference(reference, index);
        }
        
        /// <summary>
        /// Resolves the given attribute name
        /// </summary>
        /// <returns>The attribute value or null if it could not be found</returns>
        /// <param name="attribute">The requested attribute name</param>
        /// <param name="index">The index of this attribute</param>
        protected override object GetAttributeValue(string attribute, int index)
        {
            if ((attribute == "WELCOMEMSG"))
            {
                return this.WelcomeMsg;
            }
            return base.GetAttributeValue(attribute, index);
        }
        
        /// <summary>
        /// Gets the Model element collection for the given feature
        /// </summary>
        /// <returns>A non-generic list of elements</returns>
        /// <param name="feature">The requested feature</param>
        protected override System.Collections.IList GetCollectionForFeature(string feature)
        {
            if ((feature == "LOCATIONS"))
            {
                return this._locations;
            }
            if ((feature == "TESTS"))
            {
                return this._tests;
            }
            return base.GetCollectionForFeature(feature);
        }
        
        /// <summary>
        /// Sets a value to the given feature
        /// </summary>
        /// <param name="feature">The requested feature</param>
        /// <param name="value">The value that should be set to that feature</param>
        protected override void SetFeature(string feature, object value)
        {
            if ((feature == "INITIALTEST"))
            {
                this.InitialTest = ((ITest)(value));
                return;
            }
            if ((feature == "WELCOMEMSG"))
            {
                this.WelcomeMsg = ((string)(value));
                return;
            }
            base.SetFeature(feature, value);
        }
        
        /// <summary>
        /// Gets the property expression for the given attribute
        /// </summary>
        /// <returns>An incremental property expression</returns>
        /// <param name="attribute">The requested attribute in upper case</param>
        protected override NMF.Expressions.INotifyExpression<object> GetExpressionForAttribute(string attribute)
        {
            if ((attribute == "WELCOMEMSG"))
            {
                return new WelcomeMsgProxy(this);
            }
            return base.GetExpressionForAttribute(attribute);
        }
        
        /// <summary>
        /// Gets the property expression for the given reference
        /// </summary>
        /// <returns>An incremental property expression</returns>
        /// <param name="reference">The requested reference in upper case</param>
        protected override NMF.Expressions.INotifyExpression<NMF.Models.IModelElement> GetExpressionForReference(string reference)
        {
            if ((reference == "INITIALTEST"))
            {
                return new InitialTestProxy(this);
            }
            return base.GetExpressionForReference(reference);
        }
        
        /// <summary>
        /// Gets the property name for the given container
        /// </summary>
        /// <returns>The name of the respective container reference</returns>
        /// <param name="container">The container object</param>
        protected override string GetCompositionName(object container)
        {
            if ((container == this._locations))
            {
                return "locations";
            }
            if ((container == this._tests))
            {
                return "tests";
            }
            return base.GetCompositionName(container);
        }
        
        /// <summary>
        /// Gets the Class for this model element
        /// </summary>
        public override IClass GetClass()
        {
            throw new NotSupportedException();
        }
        
        /// <summary>
        /// The collection class to to represent the children of the Game class
        /// </summary>
        public class GameChildrenCollection : ReferenceCollection, ICollectionExpression<IModelElement>, ICollection<IModelElement>
        {
            
            private Game _parent;
            
            /// <summary>
            /// Creates a new instance
            /// </summary>
            public GameChildrenCollection(Game parent)
            {
                this._parent = parent;
            }
            
            /// <summary>
            /// Gets the amount of elements contained in this collection
            /// </summary>
            public override int Count
            {
                get
                {
                    int count = 0;
                    count = (count + this._parent.Locations.Count);
                    count = (count + this._parent.Tests.Count);
                    if ((this._parent.InitialTest != null))
                    {
                        count = (count + 1);
                    }
                    return count;
                }
            }
            
            protected override void AttachCore()
            {
                this._parent.Locations.AsNotifiable().CollectionChanged += this.PropagateCollectionChanges;
                this._parent.Tests.AsNotifiable().CollectionChanged += this.PropagateCollectionChanges;
                this._parent.InitialTestChanged += this.PropagateValueChanges;
            }
            
            protected override void DetachCore()
            {
                this._parent.Locations.AsNotifiable().CollectionChanged -= this.PropagateCollectionChanges;
                this._parent.Tests.AsNotifiable().CollectionChanged -= this.PropagateCollectionChanges;
                this._parent.InitialTestChanged -= this.PropagateValueChanges;
            }
            
            /// <summary>
            /// Adds the given element to the collection
            /// </summary>
            /// <param name="item">The item to add</param>
            public override void Add(IModelElement item)
            {
                ILocation locationsCasted = item.As<ILocation>();
                if ((locationsCasted != null))
                {
                    this._parent.Locations.Add(locationsCasted);
                }
                ITest testsCasted = item.As<ITest>();
                if ((testsCasted != null))
                {
                    this._parent.Tests.Add(testsCasted);
                }
                if ((this._parent.InitialTest == null))
                {
                    ITest initialTestCasted = item.As<ITest>();
                    if ((initialTestCasted != null))
                    {
                        this._parent.InitialTest = initialTestCasted;
                        return;
                    }
                }
            }
            
            /// <summary>
            /// Clears the collection and resets all references that implement it.
            /// </summary>
            public override void Clear()
            {
                this._parent.Locations.Clear();
                this._parent.Tests.Clear();
                this._parent.InitialTest = null;
            }
            
            /// <summary>
            /// Gets a value indicating whether the given element is contained in the collection
            /// </summary>
            /// <returns>True, if it is contained, otherwise False</returns>
            /// <param name="item">The item that should be looked out for</param>
            public override bool Contains(IModelElement item)
            {
                if (this._parent.Locations.Contains(item))
                {
                    return true;
                }
                if (this._parent.Tests.Contains(item))
                {
                    return true;
                }
                if ((item == this._parent.InitialTest))
                {
                    return true;
                }
                return false;
            }
            
            /// <summary>
            /// Copies the contents of the collection to the given array starting from the given array index
            /// </summary>
            /// <param name="array">The array in which the elements should be copied</param>
            /// <param name="arrayIndex">The starting index</param>
            public override void CopyTo(IModelElement[] array, int arrayIndex)
            {
                IEnumerator<IModelElement> locationsEnumerator = this._parent.Locations.GetEnumerator();
                try
                {
                    for (
                    ; locationsEnumerator.MoveNext(); 
                    )
                    {
                        array[arrayIndex] = locationsEnumerator.Current;
                        arrayIndex = (arrayIndex + 1);
                    }
                }
                finally
                {
                    locationsEnumerator.Dispose();
                }
                IEnumerator<IModelElement> testsEnumerator = this._parent.Tests.GetEnumerator();
                try
                {
                    for (
                    ; testsEnumerator.MoveNext(); 
                    )
                    {
                        array[arrayIndex] = testsEnumerator.Current;
                        arrayIndex = (arrayIndex + 1);
                    }
                }
                finally
                {
                    testsEnumerator.Dispose();
                }
                if ((this._parent.InitialTest != null))
                {
                    array[arrayIndex] = this._parent.InitialTest;
                    arrayIndex = (arrayIndex + 1);
                }
            }
            
            /// <summary>
            /// Removes the given item from the collection
            /// </summary>
            /// <returns>True, if the item was removed, otherwise False</returns>
            /// <param name="item">The item that should be removed</param>
            public override bool Remove(IModelElement item)
            {
                ILocation locationItem = item.As<ILocation>();
                if (((locationItem != null) 
                            && this._parent.Locations.Remove(locationItem)))
                {
                    return true;
                }
                ITest testItem = item.As<ITest>();
                if (((testItem != null) 
                            && this._parent.Tests.Remove(testItem)))
                {
                    return true;
                }
                if ((this._parent.InitialTest == item))
                {
                    this._parent.InitialTest = null;
                    return true;
                }
                return false;
            }
            
            /// <summary>
            /// Gets an enumerator that enumerates the collection
            /// </summary>
            /// <returns>A generic enumerator</returns>
            public override IEnumerator<IModelElement> GetEnumerator()
            {
                return Enumerable.Empty<IModelElement>().Concat(this._parent.Locations).Concat(this._parent.Tests).Concat(this._parent.InitialTest).GetEnumerator();
            }
        }
        
        /// <summary>
        /// The collection class to to represent the children of the Game class
        /// </summary>
        public class GameReferencedElementsCollection : ReferenceCollection, ICollectionExpression<IModelElement>, ICollection<IModelElement>
        {
            
            private Game _parent;
            
            /// <summary>
            /// Creates a new instance
            /// </summary>
            public GameReferencedElementsCollection(Game parent)
            {
                this._parent = parent;
            }
            
            /// <summary>
            /// Gets the amount of elements contained in this collection
            /// </summary>
            public override int Count
            {
                get
                {
                    int count = 0;
                    count = (count + this._parent.Locations.Count);
                    count = (count + this._parent.Tests.Count);
                    if ((this._parent.InitialTest != null))
                    {
                        count = (count + 1);
                    }
                    return count;
                }
            }
            
            protected override void AttachCore()
            {
                this._parent.Locations.AsNotifiable().CollectionChanged += this.PropagateCollectionChanges;
                this._parent.Tests.AsNotifiable().CollectionChanged += this.PropagateCollectionChanges;
                this._parent.InitialTestChanged += this.PropagateValueChanges;
            }
            
            protected override void DetachCore()
            {
                this._parent.Locations.AsNotifiable().CollectionChanged -= this.PropagateCollectionChanges;
                this._parent.Tests.AsNotifiable().CollectionChanged -= this.PropagateCollectionChanges;
                this._parent.InitialTestChanged -= this.PropagateValueChanges;
            }
            
            /// <summary>
            /// Adds the given element to the collection
            /// </summary>
            /// <param name="item">The item to add</param>
            public override void Add(IModelElement item)
            {
                ILocation locationsCasted = item.As<ILocation>();
                if ((locationsCasted != null))
                {
                    this._parent.Locations.Add(locationsCasted);
                }
                ITest testsCasted = item.As<ITest>();
                if ((testsCasted != null))
                {
                    this._parent.Tests.Add(testsCasted);
                }
                if ((this._parent.InitialTest == null))
                {
                    ITest initialTestCasted = item.As<ITest>();
                    if ((initialTestCasted != null))
                    {
                        this._parent.InitialTest = initialTestCasted;
                        return;
                    }
                }
            }
            
            /// <summary>
            /// Clears the collection and resets all references that implement it.
            /// </summary>
            public override void Clear()
            {
                this._parent.Locations.Clear();
                this._parent.Tests.Clear();
                this._parent.InitialTest = null;
            }
            
            /// <summary>
            /// Gets a value indicating whether the given element is contained in the collection
            /// </summary>
            /// <returns>True, if it is contained, otherwise False</returns>
            /// <param name="item">The item that should be looked out for</param>
            public override bool Contains(IModelElement item)
            {
                if (this._parent.Locations.Contains(item))
                {
                    return true;
                }
                if (this._parent.Tests.Contains(item))
                {
                    return true;
                }
                if ((item == this._parent.InitialTest))
                {
                    return true;
                }
                return false;
            }
            
            /// <summary>
            /// Copies the contents of the collection to the given array starting from the given array index
            /// </summary>
            /// <param name="array">The array in which the elements should be copied</param>
            /// <param name="arrayIndex">The starting index</param>
            public override void CopyTo(IModelElement[] array, int arrayIndex)
            {
                IEnumerator<IModelElement> locationsEnumerator = this._parent.Locations.GetEnumerator();
                try
                {
                    for (
                    ; locationsEnumerator.MoveNext(); 
                    )
                    {
                        array[arrayIndex] = locationsEnumerator.Current;
                        arrayIndex = (arrayIndex + 1);
                    }
                }
                finally
                {
                    locationsEnumerator.Dispose();
                }
                IEnumerator<IModelElement> testsEnumerator = this._parent.Tests.GetEnumerator();
                try
                {
                    for (
                    ; testsEnumerator.MoveNext(); 
                    )
                    {
                        array[arrayIndex] = testsEnumerator.Current;
                        arrayIndex = (arrayIndex + 1);
                    }
                }
                finally
                {
                    testsEnumerator.Dispose();
                }
                if ((this._parent.InitialTest != null))
                {
                    array[arrayIndex] = this._parent.InitialTest;
                    arrayIndex = (arrayIndex + 1);
                }
            }
            
            /// <summary>
            /// Removes the given item from the collection
            /// </summary>
            /// <returns>True, if the item was removed, otherwise False</returns>
            /// <param name="item">The item that should be removed</param>
            public override bool Remove(IModelElement item)
            {
                ILocation locationItem = item.As<ILocation>();
                if (((locationItem != null) 
                            && this._parent.Locations.Remove(locationItem)))
                {
                    return true;
                }
                ITest testItem = item.As<ITest>();
                if (((testItem != null) 
                            && this._parent.Tests.Remove(testItem)))
                {
                    return true;
                }
                if ((this._parent.InitialTest == item))
                {
                    this._parent.InitialTest = null;
                    return true;
                }
                return false;
            }
            
            /// <summary>
            /// Gets an enumerator that enumerates the collection
            /// </summary>
            /// <returns>A generic enumerator</returns>
            public override IEnumerator<IModelElement> GetEnumerator()
            {
                return Enumerable.Empty<IModelElement>().Concat(this._parent.Locations).Concat(this._parent.Tests).Concat(this._parent.InitialTest).GetEnumerator();
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the welcomeMsg property
        /// </summary>
        private sealed class WelcomeMsgProxy : ModelPropertyChange<IGame, string>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public WelcomeMsgProxy(IGame modelElement) : 
                    base(modelElement, "welcomeMsg")
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override string Value
            {
                get
                {
                    return this.ModelElement.WelcomeMsg;
                }
                set
                {
                    this.ModelElement.WelcomeMsg = value;
                }
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the initialTest property
        /// </summary>
        private sealed class InitialTestProxy : ModelPropertyChange<IGame, ITest>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public InitialTestProxy(IGame modelElement) : 
                    base(modelElement, "initialTest")
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override ITest Value
            {
                get
                {
                    return this.ModelElement.InitialTest;
                }
                set
                {
                    this.ModelElement.InitialTest = value;
                }
            }
        }
    }
}

