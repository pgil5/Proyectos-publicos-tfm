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
using NMF.Models.Repository;
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

namespace DemoNMF.FSM
{
    
    
    /// <summary>
    /// The default implementation of the StateMachine class
    /// </summary>
    [XmlIdentifierAttribute("name")]
    [XmlNamespaceAttribute("http://github.com/NMFCode/Examples/FiniteStateMachines")]
    [XmlNamespacePrefixAttribute("fsm")]
    [ModelRepresentationClassAttribute("http://github.com/NMFCode/Examples/FiniteStateMachines#//StateMachine")]
    [DebuggerDisplayAttribute("StateMachine {Name}")]
    public partial class StateMachine : ModelElement, IStateMachine, IModelElement
    {
        
        /// <summary>
        /// The backing field for the Name property
        /// </summary>
        [DebuggerBrowsableAttribute(DebuggerBrowsableState.Never)]
        private string _name;
        
        private static Lazy<ITypedElement> _nameAttribute = new Lazy<ITypedElement>(RetrieveNameAttribute);
        
        private static Lazy<ITypedElement> _statesReference = new Lazy<ITypedElement>(RetrieveStatesReference);
        
        /// <summary>
        /// The backing field for the States property
        /// </summary>
        [DebuggerBrowsableAttribute(DebuggerBrowsableState.Never)]
        private ObservableCompositionOrderedSet<IState> _states;
        
        private static Lazy<ITypedElement> _startStateReference = new Lazy<ITypedElement>(RetrieveStartStateReference);
        
        /// <summary>
        /// The backing field for the StartState property
        /// </summary>
        [DebuggerBrowsableAttribute(DebuggerBrowsableState.Never)]
        private IState _startState;
        
        private static IClass _classInstance;
        
        public StateMachine()
        {
            this._states = new ObservableCompositionOrderedSet<IState>(this);
            this._states.CollectionChanging += this.StatesCollectionChanging;
            this._states.CollectionChanged += this.StatesCollectionChanged;
        }
        
        /// <summary>
        /// The name property
        /// </summary>
        [DisplayNameAttribute("name")]
        [CategoryAttribute("StateMachine")]
        [XmlElementNameAttribute("name")]
        [IdAttribute()]
        [XmlAttributeAttribute(true)]
        public string Name
        {
            get
            {
                return this._name;
            }
            set
            {
                if ((this._name != value))
                {
                    string old = this._name;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnNameChanging(e);
                    this.OnPropertyChanging("Name", e, _nameAttribute);
                    this._name = value;
                    this.OnNameChanged(e);
                    this.OnPropertyChanged("Name", e, _nameAttribute);
                }
            }
        }
        
        /// <summary>
        /// The states property
        /// </summary>
        [DesignerSerializationVisibilityAttribute(DesignerSerializationVisibility.Content)]
        [BrowsableAttribute(false)]
        [XmlElementNameAttribute("states")]
        [XmlAttributeAttribute(false)]
        [ContainmentAttribute()]
        [ConstantAttribute()]
        public IOrderedSetExpression<IState> States
        {
            get
            {
                return this._states;
            }
        }
        
        /// <summary>
        /// The startState property
        /// </summary>
        [DisplayNameAttribute("startState")]
        [CategoryAttribute("StateMachine")]
        [XmlElementNameAttribute("startState")]
        [XmlAttributeAttribute(true)]
        public IState StartState
        {
            get
            {
                return this._startState;
            }
            set
            {
                if ((this._startState != value))
                {
                    IState old = this._startState;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnStartStateChanging(e);
                    this.OnPropertyChanging("StartState", e, _startStateReference);
                    this._startState = value;
                    if ((old != null))
                    {
                        old.Deleted -= this.OnResetStartState;
                    }
                    if ((value != null))
                    {
                        value.Deleted += this.OnResetStartState;
                    }
                    this.OnStartStateChanged(e);
                    this.OnPropertyChanged("StartState", e, _startStateReference);
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
                return base.Children.Concat(new StateMachineChildrenCollection(this));
            }
        }
        
        /// <summary>
        /// Gets the referenced model elements of this model element
        /// </summary>
        public override IEnumerableExpression<IModelElement> ReferencedElements
        {
            get
            {
                return base.ReferencedElements.Concat(new StateMachineReferencedElementsCollection(this));
            }
        }
        
        /// <summary>
        /// Gets the Class model for this type
        /// </summary>
        public new static IClass ClassInstance
        {
            get
            {
                if ((_classInstance == null))
                {
                    _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://github.com/NMFCode/Examples/FiniteStateMachines#//StateMachine")));
                }
                return _classInstance;
            }
        }
        
        /// <summary>
        /// Gets a value indicating whether the current model element can be identified by an attribute value
        /// </summary>
        public override bool IsIdentified
        {
            get
            {
                return true;
            }
        }
        
        /// <summary>
        /// Gets fired before the Name property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> NameChanging;
        
        /// <summary>
        /// Gets fired when the Name property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> NameChanged;
        
        /// <summary>
        /// Gets fired before the StartState property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> StartStateChanging;
        
        /// <summary>
        /// Gets fired when the StartState property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> StartStateChanged;
        
        private static ITypedElement RetrieveNameAttribute()
        {
            return ((ITypedElement)(((ModelElement)(DemoNMF.FSM.StateMachine.ClassInstance)).Resolve("name")));
        }
        
        /// <summary>
        /// Raises the NameChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnNameChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.NameChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the NameChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnNameChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.NameChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        private static ITypedElement RetrieveStatesReference()
        {
            return ((ITypedElement)(((ModelElement)(DemoNMF.FSM.StateMachine.ClassInstance)).Resolve("states")));
        }
        
        /// <summary>
        /// Forwards CollectionChanging notifications for the States property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void StatesCollectionChanging(object sender, NotifyCollectionChangedEventArgs e)
        {
            this.OnCollectionChanging("States", e, _statesReference);
        }
        
        /// <summary>
        /// Forwards CollectionChanged notifications for the States property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void StatesCollectionChanged(object sender, NotifyCollectionChangedEventArgs e)
        {
            this.OnCollectionChanged("States", e, _statesReference);
        }
        
        private static ITypedElement RetrieveStartStateReference()
        {
            return ((ITypedElement)(((ModelElement)(DemoNMF.FSM.StateMachine.ClassInstance)).Resolve("startState")));
        }
        
        /// <summary>
        /// Raises the StartStateChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnStartStateChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.StartStateChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the StartStateChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnStartStateChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.StartStateChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Handles the event that the StartState property must reset
        /// </summary>
        /// <param name="sender">The object that sent this reset request</param>
        /// <param name="eventArgs">The event data for the reset event</param>
        private void OnResetStartState(object sender, System.EventArgs eventArgs)
        {
            this.StartState = null;
        }
        
        /// <summary>
        /// Gets the relative URI fragment for the given child model element
        /// </summary>
        /// <returns>A fragment of the relative URI</returns>
        /// <param name="element">The element that should be looked for</param>
        protected override string GetRelativePathForNonIdentifiedChild(IModelElement element)
        {
            int statesIndex = ModelHelper.IndexOfReference(this.States, element);
            if ((statesIndex != -1))
            {
                return ModelHelper.CreatePath("states", statesIndex);
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
            if ((reference == "STATES"))
            {
                if ((index < this.States.Count))
                {
                    return this.States[index];
                }
                else
                {
                    return null;
                }
            }
            if ((reference == "STARTSTATE"))
            {
                return this.StartState;
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
            if ((attribute == "NAME"))
            {
                return this.Name;
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
            if ((feature == "STATES"))
            {
                return this._states;
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
            if ((feature == "STARTSTATE"))
            {
                this.StartState = ((IState)(value));
                return;
            }
            if ((feature == "NAME"))
            {
                this.Name = ((string)(value));
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
            if ((attribute == "NAME"))
            {
                return new NameProxy(this);
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
            if ((reference == "STARTSTATE"))
            {
                return new StartStateProxy(this);
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
            if ((container == this._states))
            {
                return "states";
            }
            return base.GetCompositionName(container);
        }
        
        /// <summary>
        /// Gets the Class for this model element
        /// </summary>
        public override IClass GetClass()
        {
            if ((_classInstance == null))
            {
                _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://github.com/NMFCode/Examples/FiniteStateMachines#//StateMachine")));
            }
            return _classInstance;
        }
        
        /// <summary>
        /// Gets the identifier string for this model element
        /// </summary>
        /// <returns>The identifier string</returns>
        public override string ToIdentifierString()
        {
            if ((this.Name == null))
            {
                return null;
            }
            return this.Name.ToString();
        }
        
        protected override Uri CreateUriWithFragment(string fragment, bool absolute, IModelElement baseElement)
        {
            return this.CreateUriFromGlobalIdentifier(fragment, absolute);
        }
        
        protected override void PropagateNewModel(Model newModel, Model oldModel, IModelElement subtreeRoot)
        {
            string id = this.ToIdentifierString();
            if ((oldModel != null))
            {
                oldModel.UnregisterId(id);
            }
            if ((newModel != null))
            {
                newModel.RegisterId(id, this);
            }
            base.PropagateNewModel(newModel, oldModel, subtreeRoot);
        }
        
        /// <summary>
        /// The collection class to to represent the children of the StateMachine class
        /// </summary>
        public class StateMachineChildrenCollection : ReferenceCollection, ICollectionExpression<IModelElement>, ICollection<IModelElement>
        {
            
            private StateMachine _parent;
            
            /// <summary>
            /// Creates a new instance
            /// </summary>
            public StateMachineChildrenCollection(StateMachine parent)
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
                    count = (count + this._parent.States.Count);
                    return count;
                }
            }
            
            protected override void AttachCore()
            {
                this._parent.States.AsNotifiable().CollectionChanged += this.PropagateCollectionChanges;
            }
            
            protected override void DetachCore()
            {
                this._parent.States.AsNotifiable().CollectionChanged -= this.PropagateCollectionChanges;
            }
            
            /// <summary>
            /// Adds the given element to the collection
            /// </summary>
            /// <param name="item">The item to add</param>
            public override void Add(IModelElement item)
            {
                IState statesCasted = item.As<IState>();
                if ((statesCasted != null))
                {
                    this._parent.States.Add(statesCasted);
                }
            }
            
            /// <summary>
            /// Clears the collection and resets all references that implement it.
            /// </summary>
            public override void Clear()
            {
                this._parent.States.Clear();
            }
            
            /// <summary>
            /// Gets a value indicating whether the given element is contained in the collection
            /// </summary>
            /// <returns>True, if it is contained, otherwise False</returns>
            /// <param name="item">The item that should be looked out for</param>
            public override bool Contains(IModelElement item)
            {
                if (this._parent.States.Contains(item))
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
                IEnumerator<IModelElement> statesEnumerator = this._parent.States.GetEnumerator();
                try
                {
                    for (
                    ; statesEnumerator.MoveNext(); 
                    )
                    {
                        array[arrayIndex] = statesEnumerator.Current;
                        arrayIndex = (arrayIndex + 1);
                    }
                }
                finally
                {
                    statesEnumerator.Dispose();
                }
            }
            
            /// <summary>
            /// Removes the given item from the collection
            /// </summary>
            /// <returns>True, if the item was removed, otherwise False</returns>
            /// <param name="item">The item that should be removed</param>
            public override bool Remove(IModelElement item)
            {
                IState stateItem = item.As<IState>();
                if (((stateItem != null) 
                            && this._parent.States.Remove(stateItem)))
                {
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
                return Enumerable.Empty<IModelElement>().Concat(this._parent.States).GetEnumerator();
            }
        }
        
        /// <summary>
        /// The collection class to to represent the children of the StateMachine class
        /// </summary>
        public class StateMachineReferencedElementsCollection : ReferenceCollection, ICollectionExpression<IModelElement>, ICollection<IModelElement>
        {
            
            private StateMachine _parent;
            
            /// <summary>
            /// Creates a new instance
            /// </summary>
            public StateMachineReferencedElementsCollection(StateMachine parent)
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
                    count = (count + this._parent.States.Count);
                    if ((this._parent.StartState != null))
                    {
                        count = (count + 1);
                    }
                    return count;
                }
            }
            
            protected override void AttachCore()
            {
                this._parent.States.AsNotifiable().CollectionChanged += this.PropagateCollectionChanges;
                this._parent.StartStateChanged += this.PropagateValueChanges;
            }
            
            protected override void DetachCore()
            {
                this._parent.States.AsNotifiable().CollectionChanged -= this.PropagateCollectionChanges;
                this._parent.StartStateChanged -= this.PropagateValueChanges;
            }
            
            /// <summary>
            /// Adds the given element to the collection
            /// </summary>
            /// <param name="item">The item to add</param>
            public override void Add(IModelElement item)
            {
                IState statesCasted = item.As<IState>();
                if ((statesCasted != null))
                {
                    this._parent.States.Add(statesCasted);
                }
                if ((this._parent.StartState == null))
                {
                    IState startStateCasted = item.As<IState>();
                    if ((startStateCasted != null))
                    {
                        this._parent.StartState = startStateCasted;
                        return;
                    }
                }
            }
            
            /// <summary>
            /// Clears the collection and resets all references that implement it.
            /// </summary>
            public override void Clear()
            {
                this._parent.States.Clear();
                this._parent.StartState = null;
            }
            
            /// <summary>
            /// Gets a value indicating whether the given element is contained in the collection
            /// </summary>
            /// <returns>True, if it is contained, otherwise False</returns>
            /// <param name="item">The item that should be looked out for</param>
            public override bool Contains(IModelElement item)
            {
                if (this._parent.States.Contains(item))
                {
                    return true;
                }
                if ((item == this._parent.StartState))
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
                IEnumerator<IModelElement> statesEnumerator = this._parent.States.GetEnumerator();
                try
                {
                    for (
                    ; statesEnumerator.MoveNext(); 
                    )
                    {
                        array[arrayIndex] = statesEnumerator.Current;
                        arrayIndex = (arrayIndex + 1);
                    }
                }
                finally
                {
                    statesEnumerator.Dispose();
                }
                if ((this._parent.StartState != null))
                {
                    array[arrayIndex] = this._parent.StartState;
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
                IState stateItem = item.As<IState>();
                if (((stateItem != null) 
                            && this._parent.States.Remove(stateItem)))
                {
                    return true;
                }
                if ((this._parent.StartState == item))
                {
                    this._parent.StartState = null;
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
                return Enumerable.Empty<IModelElement>().Concat(this._parent.States).Concat(this._parent.StartState).GetEnumerator();
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the name property
        /// </summary>
        private sealed class NameProxy : ModelPropertyChange<IStateMachine, string>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public NameProxy(IStateMachine modelElement) : 
                    base(modelElement, "name")
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override string Value
            {
                get
                {
                    return this.ModelElement.Name;
                }
                set
                {
                    this.ModelElement.Name = value;
                }
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the startState property
        /// </summary>
        private sealed class StartStateProxy : ModelPropertyChange<IStateMachine, IState>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public StartStateProxy(IStateMachine modelElement) : 
                    base(modelElement, "startState")
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override IState Value
            {
                get
                {
                    return this.ModelElement.StartState;
                }
                set
                {
                    this.ModelElement.StartState = value;
                }
            }
        }
    }
}

